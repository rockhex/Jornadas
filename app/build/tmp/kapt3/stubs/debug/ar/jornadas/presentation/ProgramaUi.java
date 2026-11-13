package ar.jornadas.presentation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Lar/jornadas/presentation/ProgramaUi;", "", "Cargando", "Listo", "Lar/jornadas/presentation/ProgramaUi$Cargando;", "Lar/jornadas/presentation/ProgramaUi$Listo;", "app_debug"})
public abstract interface ProgramaUi {
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lar/jornadas/presentation/ProgramaUi$Cargando;", "Lar/jornadas/presentation/ProgramaUi;", "()V", "app_debug"})
    public static final class Cargando implements ar.jornadas.presentation.ProgramaUi {
        @org.jetbrains.annotations.NotNull()
        public static final ar.jornadas.presentation.ProgramaUi.Cargando INSTANCE = null;
        
        private Cargando() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u00c6\u0003JI\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012\u00a8\u0006!"}, d2 = {"Lar/jornadas/presentation/ProgramaUi$Listo;", "Lar/jornadas/presentation/ProgramaUi;", "todas", "", "Lar/jornadas/domain/model/Charla;", "visibles", "hayEdicion", "", "sincronizando", "aviso", "Lar/jornadas/presentation/Aviso;", "(Ljava/util/List;Ljava/util/List;ZZLar/jornadas/presentation/Aviso;)V", "getAviso", "()Lar/jornadas/presentation/Aviso;", "getHayEdicion", "()Z", "getSincronizando", "getTodas", "()Ljava/util/List;", "getVisibles", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Listo implements ar.jornadas.presentation.ProgramaUi {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ar.jornadas.domain.model.Charla> todas = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ar.jornadas.domain.model.Charla> visibles = null;
        private final boolean hayEdicion = false;
        private final boolean sincronizando = false;
        @org.jetbrains.annotations.Nullable()
        private final ar.jornadas.presentation.Aviso aviso = null;
        
        public Listo(@org.jetbrains.annotations.NotNull()
        java.util.List<ar.jornadas.domain.model.Charla> todas, @org.jetbrains.annotations.NotNull()
        java.util.List<ar.jornadas.domain.model.Charla> visibles, boolean hayEdicion, boolean sincronizando, @org.jetbrains.annotations.Nullable()
        ar.jornadas.presentation.Aviso aviso) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ar.jornadas.domain.model.Charla> getTodas() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ar.jornadas.domain.model.Charla> getVisibles() {
            return null;
        }
        
        public final boolean getHayEdicion() {
            return false;
        }
        
        public final boolean getSincronizando() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ar.jornadas.presentation.Aviso getAviso() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ar.jornadas.domain.model.Charla> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ar.jornadas.domain.model.Charla> component2() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ar.jornadas.presentation.Aviso component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ar.jornadas.presentation.ProgramaUi.Listo copy(@org.jetbrains.annotations.NotNull()
        java.util.List<ar.jornadas.domain.model.Charla> todas, @org.jetbrains.annotations.NotNull()
        java.util.List<ar.jornadas.domain.model.Charla> visibles, boolean hayEdicion, boolean sincronizando, @org.jetbrains.annotations.Nullable()
        ar.jornadas.presentation.Aviso aviso) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}