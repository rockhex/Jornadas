// data/local/Archivo.kt
package ar.jornadas.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [CharlaEntity::class, SyncEstadoEntity::class], version = 2, exportSchema = true)
abstract class Archivo : RoomDatabase() {
    abstract fun cartelera(): CarteleraDao
}