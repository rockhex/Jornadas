package ar.jornadas.di;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lar/jornadas/di/AppContainer;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "agenda", "Lar/jornadas/domain/repository/AgendaRepository;", "getAgenda", "()Lar/jornadas/domain/repository/AgendaRepository;", "api", "Lar/jornadas/data/remote/ProgramaApi;", "kotlin.jvm.PlatformType", "app", "db", "Lar/jornadas/data/local/Archivo;", "mesa", "Lar/jornadas/lab/ControlMesa;", "getMesa", "()Lar/jornadas/lab/ControlMesa;", "servicioLocal", "Lar/jornadas/lab/ServicioLocal;", "sesion", "Lar/jornadas/presentation/SesionDescargas;", "getSesion", "()Lar/jornadas/presentation/SesionDescargas;", "app_debug"})
public final class AppContainer {
    private final android.content.Context app = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.lab.ServicioLocal servicioLocal = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.lab.ControlMesa mesa = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.data.local.Archivo db = null;
    private final ar.jornadas.data.remote.ProgramaApi api = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.domain.repository.AgendaRepository agenda = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.presentation.SesionDescargas sesion = null;
    
    public AppContainer(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ar.jornadas.lab.ControlMesa getMesa() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ar.jornadas.domain.repository.AgendaRepository getAgenda() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ar.jornadas.presentation.SesionDescargas getSesion() {
        return null;
    }
}