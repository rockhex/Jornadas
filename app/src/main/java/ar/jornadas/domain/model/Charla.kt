package ar.jornadas.domain.model

data class Charla(
    val id: String, val titulo: String, val tema: String, val dia: Int,
    val hora: String, val sala: String, val ponente: String, val resumen: String,
    val favorita: Boolean,
)
//data class ProgramaGuardado(val charlas: List<Charla>, val hayEdicion: Boolean)
//
//sealed interface ResultadoSync {
//    object Exito : ResultadoSync
//    object Fallo : ResultadoSync
//    object YaEnCurso : ResultadoSync
//}