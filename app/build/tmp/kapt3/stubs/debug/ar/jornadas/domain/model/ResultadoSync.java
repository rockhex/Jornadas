package ar.jornadas.domain.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lar/jornadas/domain/model/ResultadoSync;", "", "Exito", "Fallo", "YaEnCurso", "Lar/jornadas/domain/model/ResultadoSync$Exito;", "Lar/jornadas/domain/model/ResultadoSync$Fallo;", "Lar/jornadas/domain/model/ResultadoSync$YaEnCurso;", "app_debug"})
public abstract interface ResultadoSync {
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lar/jornadas/domain/model/ResultadoSync$Exito;", "Lar/jornadas/domain/model/ResultadoSync;", "()V", "app_debug"})
    public static final class Exito implements ar.jornadas.domain.model.ResultadoSync {
        @org.jetbrains.annotations.NotNull()
        public static final ar.jornadas.domain.model.ResultadoSync.Exito INSTANCE = null;
        
        private Exito() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lar/jornadas/domain/model/ResultadoSync$Fallo;", "Lar/jornadas/domain/model/ResultadoSync;", "()V", "app_debug"})
    public static final class Fallo implements ar.jornadas.domain.model.ResultadoSync {
        @org.jetbrains.annotations.NotNull()
        public static final ar.jornadas.domain.model.ResultadoSync.Fallo INSTANCE = null;
        
        private Fallo() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lar/jornadas/domain/model/ResultadoSync$YaEnCurso;", "Lar/jornadas/domain/model/ResultadoSync;", "()V", "app_debug"})
    public static final class YaEnCurso implements ar.jornadas.domain.model.ResultadoSync {
        @org.jetbrains.annotations.NotNull()
        public static final ar.jornadas.domain.model.ResultadoSync.YaEnCurso INSTANCE = null;
        
        private YaEnCurso() {
            super();
        }
    }
}