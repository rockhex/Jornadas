package ar.jornadas.presentation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ar.jornadas.domain.model.ResultadoSync
import ar.jornadas.domain.repository.AgendaRepository
import ar.jornadas.domain.usecase.filtrarCharlas
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

// presentation/ProgramaViewModel.kt   (reemplaza ui/ProgramaModel.kt)
class ProgramaViewModel(
    private val repo: AgendaRepository,
    private val sesion: SesionDescargas,
    private val state: SavedStateHandle,      // sobrevive a rotación Y a muerte del proceso
) : ViewModel() {

    val dia = state.getStateFlow("dia", 0)
    val tema = state.getStateFlow("tema", "Todos")
    fun elegirDia(v: Int) { state["dia"] = v }
    fun elegirTema(v: String) { state["tema"] = v }

    private val fallo = MutableStateFlow(false)

    val ui: StateFlow<ProgramaUi> =
        combine(repo.programa, dia, tema, repo.sincronizando, fallo) { p, d, t, sync, f ->
            ProgramaUi.Listo(
                todas = p.charlas,
                visibles = filtrarCharlas(p.charlas, d, t),
                hayEdicion = p.hayEdicion,
                sincronizando = sync,
                aviso = when {
                    !f -> null
                    p.hayEdicion -> Aviso.DatosGuardados
                    else -> Aviso.SinDescargaPrevia
                },
            )
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), ProgramaUi.Cargando)

    init { if (sesion.reclamarCargaAutomatica()) actualizar() }   // 1 por proceso

    fun actualizar() {                                            // acción explícita
        viewModelScope.launch {
            when (repo.sincronizar()) {
                ResultadoSync.Exito -> fallo.value = false
                ResultadoSync.Fallo -> fallo.value = true
                ResultadoSync.YaEnCurso -> Unit                   // segundo toque: +0
            }
        }
    }

    fun marcar(id: String) { viewModelScope.launch { repo.alternarFavorita(id) } }
}