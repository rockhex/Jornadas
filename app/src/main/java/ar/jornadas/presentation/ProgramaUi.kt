package ar.jornadas.presentation

import ar.jornadas.domain.model.Charla

sealed interface ProgramaUi {
    object Cargando : ProgramaUi
    data class Listo(
        val todas: List<Charla>, val visibles: List<Charla>,
        val hayEdicion: Boolean, val sincronizando: Boolean, val aviso: Aviso?,
    ) : ProgramaUi
}
enum class Aviso { DatosGuardados, SinDescargaPrevia }