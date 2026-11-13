package ar.jornadas.data.remote

data class FichaRemota(
    val id: String, val title: String, val track: String, val day: Int,
    val time: String, val room: String, val speaker: String, val summary: String,
)