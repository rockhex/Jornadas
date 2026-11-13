package ar.jornadas.data.remote

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "charlas")
data class Charla(@PrimaryKey val id: String, val titulo: String, val tema: String, val dia: Int,
                  val hora: String, val sala: String, val ponente: String, val resumen: String,
                  val favorita: Boolean = false)