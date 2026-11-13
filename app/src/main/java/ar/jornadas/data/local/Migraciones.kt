// data/local/Migraciones.kt   (es un val top-level, no una clase)
package ar.jornadas.data.local

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val MIGRACION_1_2 = object : Migration(1, 2) {
    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("CREATE TABLE IF NOT EXISTS sync_estado " +
                "(id INTEGER NOT NULL, ultimaSync INTEGER NOT NULL, PRIMARY KEY(id))")
        db.execSQL("INSERT INTO sync_estado (id, ultimaSync) " +
                "SELECT 1, 0 WHERE EXISTS (SELECT 1 FROM charlas)")
    }
}