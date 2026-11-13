package ar.jornadas.domain.repository


import ar.jornadas.domain.model.ProgramaGuardado
import ar.jornadas.domain.model.ResultadoSync
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow


//(la interfaz la posee el DOMINIO → DIP)


interface AgendaRepository {
    val programa: Flow<ProgramaGuardado>
    val sincronizando: StateFlow<Boolean>
    suspend fun sincronizar(): ResultadoSync
    suspend fun alternarFavorita(id: String)
}


//class AgendaRepository {
//}
//
//class AgendaRepository(private val api: ProgramaApi, private val dao: CarteleraDao) {
//    val programa = dao.observar()
//
//    suspend fun sincronizar() {
//        val fichas = api.consultar().map {
//            Charla(it.id, it.title, it.track, it.day, it.time, it.room, it.speaker, it.summary)
//        }
//        dao.guardar(fichas)
//    }
//
//    suspend fun cambiarFavorita(id: String) = dao.alternar(id)
//}