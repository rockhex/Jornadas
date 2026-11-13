package ar.jornadas.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/** Cada fila existente significa "ya se descargó al menos una edición completa". */
@Entity(tableName = "sync_estado")
data class SyncEstadoEntity(@PrimaryKey val id: Int = 1, val ultimaSync: Long)