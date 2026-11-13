package ar.jornadas.data.repository

import ar.jornadas.data.local.CarteleraDao
import ar.jornadas.data.mapper.aContenido
import ar.jornadas.data.mapper.aDominio
import ar.jornadas.data.remote.ProgramaApi
import ar.jornadas.domain.model.ProgramaGuardado
import ar.jornadas.domain.model.ResultadoSync
import ar.jornadas.domain.repository.AgendaRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.coroutines.cancellation.CancellationException
class AgendaRepositoryImpl(
    private val api: ProgramaApi,
    private val dao: CarteleraDao,
    private val reloj: () -> Long = System::currentTimeMillis,
) : AgendaRepository {

    private val enCurso = AtomicBoolean(false)
    private val _sincronizando = MutableStateFlow(false)
    override val sincronizando = _sincronizando.asStateFlow()

    override val programa = combine(dao.observarCharlas(), dao.observarHayEdicion()) { c, h ->
        ProgramaGuardado(c.map { it.aDominio() }, h)
    }

    override suspend fun sincronizar(): ResultadoSync {
        if (!enCurso.compareAndSet(false, true)) return ResultadoSync.YaEnCurso
        _sincronizando.value = true
        return try {
            dao.aplicarInstantanea(api.consultar().map { it.aContenido() }, reloj())
            ResultadoSync.Exito
        } catch (e: CancellationException) {
            throw e
        } catch (e: Exception) {          // IOException, HttpException, JsonSyntaxException, NPE de Gson
            ResultadoSync.Fallo
        } finally {
            _sincronizando.value = false
            enCurso.set(false)
        }
    }

    override suspend fun alternarFavorita(id: String) = dao.alternar(id)
}