package ar.jornadas.domain.model
sealed interface ResultadoSync {
    object Exito : ResultadoSync
    object Fallo : ResultadoSync
    object YaEnCurso : ResultadoSync
}