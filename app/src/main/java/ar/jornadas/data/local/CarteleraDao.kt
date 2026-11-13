// data/local/CarteleraDao.kt
package ar.jornadas.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class CarteleraDao {
    @Query("SELECT * FROM charlas ORDER BY dia, hora, sala")
    abstract fun observarCharlas(): Flow<List<CharlaEntity>>

    @Query("SELECT COUNT(*) > 0 FROM sync_estado")
    abstract fun observarHayEdicion(): Flow<Boolean>

    @Query("UPDATE charlas SET favorita = NOT favorita WHERE id = :id")
    abstract suspend fun alternar(id: String)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun insertarSiFalta(charlas: List<CharlaEntity>)

    @Update(entity = CharlaEntity::class)
    abstract suspend fun actualizarContenido(contenido: List<ContenidoCharla>)

    @Query("DELETE FROM charlas WHERE id NOT IN (:vigentes)")
    abstract suspend fun retirarAusentes(vigentes: List<String>)

    @Query("DELETE FROM charlas")
    abstract suspend fun retirarTodas()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun marcarEdicion(estado: SyncEstadoEntity)

    @Transaction
    open suspend fun aplicarInstantanea(remotas: List<ContenidoCharla>, ahora: Long) {
        if (remotas.isEmpty()) retirarTodas() else retirarAusentes(remotas.map { it.id })
        insertarSiFalta(remotas.map {
            CharlaEntity(it.id, it.titulo, it.tema, it.dia, it.hora, it.sala, it.ponente, it.resumen)
        })
        actualizarContenido(remotas)
        marcarEdicion(SyncEstadoEntity(1, ahora))
    }
}