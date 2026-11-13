package ar.jornadas.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class Archivo_Impl extends Archivo {
  private volatile CarteleraDao _carteleraDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `charlas` (`id` TEXT NOT NULL, `titulo` TEXT NOT NULL, `tema` TEXT NOT NULL, `dia` INTEGER NOT NULL, `hora` TEXT NOT NULL, `sala` TEXT NOT NULL, `ponente` TEXT NOT NULL, `resumen` TEXT NOT NULL, `favorita` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `sync_estado` (`id` INTEGER NOT NULL, `ultimaSync` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b70d358b42ca9cce624749b6e42a84f7')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `charlas`");
        db.execSQL("DROP TABLE IF EXISTS `sync_estado`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsCharlas = new HashMap<String, TableInfo.Column>(9);
        _columnsCharlas.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharlas.put("titulo", new TableInfo.Column("titulo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharlas.put("tema", new TableInfo.Column("tema", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharlas.put("dia", new TableInfo.Column("dia", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharlas.put("hora", new TableInfo.Column("hora", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharlas.put("sala", new TableInfo.Column("sala", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharlas.put("ponente", new TableInfo.Column("ponente", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharlas.put("resumen", new TableInfo.Column("resumen", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharlas.put("favorita", new TableInfo.Column("favorita", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCharlas = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCharlas = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCharlas = new TableInfo("charlas", _columnsCharlas, _foreignKeysCharlas, _indicesCharlas);
        final TableInfo _existingCharlas = TableInfo.read(db, "charlas");
        if (!_infoCharlas.equals(_existingCharlas)) {
          return new RoomOpenHelper.ValidationResult(false, "charlas(ar.jornadas.data.local.CharlaEntity).\n"
                  + " Expected:\n" + _infoCharlas + "\n"
                  + " Found:\n" + _existingCharlas);
        }
        final HashMap<String, TableInfo.Column> _columnsSyncEstado = new HashMap<String, TableInfo.Column>(2);
        _columnsSyncEstado.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSyncEstado.put("ultimaSync", new TableInfo.Column("ultimaSync", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSyncEstado = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSyncEstado = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSyncEstado = new TableInfo("sync_estado", _columnsSyncEstado, _foreignKeysSyncEstado, _indicesSyncEstado);
        final TableInfo _existingSyncEstado = TableInfo.read(db, "sync_estado");
        if (!_infoSyncEstado.equals(_existingSyncEstado)) {
          return new RoomOpenHelper.ValidationResult(false, "sync_estado(ar.jornadas.data.local.SyncEstadoEntity).\n"
                  + " Expected:\n" + _infoSyncEstado + "\n"
                  + " Found:\n" + _existingSyncEstado);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "b70d358b42ca9cce624749b6e42a84f7", "76cc8a8511e1e5b706a07efc64e56376");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "charlas","sync_estado");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `charlas`");
      _db.execSQL("DELETE FROM `sync_estado`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CarteleraDao.class, CarteleraDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public CarteleraDao cartelera() {
    if (_carteleraDao != null) {
      return _carteleraDao;
    } else {
      synchronized(this) {
        if(_carteleraDao == null) {
          _carteleraDao = new CarteleraDao_Impl(this);
        }
        return _carteleraDao;
      }
    }
  }
}
