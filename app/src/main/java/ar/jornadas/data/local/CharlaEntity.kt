package ar.jornadas.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import ar.jornadas.domain.model.Charla



@Entity(tableName = "charlas")
data class CharlaEntity(
    @PrimaryKey val id: String, val titulo: String, val tema: String, val dia: Int,
    val hora: String, val sala: String, val ponente: String, val resumen: String,
    val favorita: Boolean = false,
)

/** Actualización parcial: NO incluye `favorita`, así nunca se pisa la marca. */
data class ContenidoCharla(
    val id: String, val titulo: String, val tema: String, val dia: Int,
    val hora: String, val sala: String, val ponente: String, val resumen: String,
)