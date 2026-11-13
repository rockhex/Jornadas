package ar.jornadas.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ$\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0097@\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u00a7@\u00a2\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00060\u001aH\'J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aH\'J\u001c\u0010\u001d\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001f\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010 \u00a8\u0006!"}, d2 = {"Lar/jornadas/data/local/CarteleraDao;", "", "()V", "actualizarContenido", "", "contenido", "", "Lar/jornadas/data/local/ContenidoCharla;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "alternar", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aplicarInstantanea", "remotas", "ahora", "", "(Ljava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertarSiFalta", "charlas", "Lar/jornadas/data/local/CharlaEntity;", "marcarEdicion", "estado", "Lar/jornadas/data/local/SyncEstadoEntity;", "(Lar/jornadas/data/local/SyncEstadoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observarCharlas", "Lkotlinx/coroutines/flow/Flow;", "observarHayEdicion", "", "retirarAusentes", "vigentes", "retirarTodas", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract class CarteleraDao {
    
    public CarteleraDao() {
        super();
    }
    
    @androidx.room.Query(value = "SELECT * FROM charlas ORDER BY dia, hora, sala")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ar.jornadas.data.local.CharlaEntity>> observarCharlas();
    
    @androidx.room.Query(value = "SELECT COUNT(*) > 0 FROM sync_estado")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> observarHayEdicion();
    
    @androidx.room.Query(value = "UPDATE charlas SET favorita = NOT favorita WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object alternar(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 5)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertarSiFalta(@org.jetbrains.annotations.NotNull()
    java.util.List<ar.jornadas.data.local.CharlaEntity> charlas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update(entity = ar.jornadas.data.local.CharlaEntity.class)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object actualizarContenido(@org.jetbrains.annotations.NotNull()
    java.util.List<ar.jornadas.data.local.ContenidoCharla> contenido, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM charlas WHERE id NOT IN (:vigentes)")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object retirarAusentes(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> vigentes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM charlas")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object retirarTodas(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object marcarEdicion(@org.jetbrains.annotations.NotNull()
    ar.jornadas.data.local.SyncEstadoEntity estado, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object aplicarInstantanea(@org.jetbrains.annotations.NotNull()
    java.util.List<ar.jornadas.data.local.ContenidoCharla> remotas, long ahora, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}