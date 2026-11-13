package ar.jornadas.presentation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lar/jornadas/presentation/ProgramaViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lar/jornadas/domain/repository/AgendaRepository;", "sesion", "Lar/jornadas/presentation/SesionDescargas;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lar/jornadas/domain/repository/AgendaRepository;Lar/jornadas/presentation/SesionDescargas;Landroidx/lifecycle/SavedStateHandle;)V", "dia", "Lkotlinx/coroutines/flow/StateFlow;", "", "getDia", "()Lkotlinx/coroutines/flow/StateFlow;", "fallo", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "tema", "", "getTema", "ui", "Lar/jornadas/presentation/ProgramaUi;", "getUi", "actualizar", "", "elegirDia", "v", "elegirTema", "marcar", "id", "app_debug"})
public final class ProgramaViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.domain.repository.AgendaRepository repo = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.presentation.SesionDescargas sesion = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.SavedStateHandle state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> dia = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> tema = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> fallo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<ar.jornadas.presentation.ProgramaUi> ui = null;
    
    public ProgramaViewModel(@org.jetbrains.annotations.NotNull()
    ar.jornadas.domain.repository.AgendaRepository repo, @org.jetbrains.annotations.NotNull()
    ar.jornadas.presentation.SesionDescargas sesion, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getDia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getTema() {
        return null;
    }
    
    public final void elegirDia(int v) {
    }
    
    public final void elegirTema(@org.jetbrains.annotations.NotNull()
    java.lang.String v) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<ar.jornadas.presentation.ProgramaUi> getUi() {
        return null;
    }
    
    public final void actualizar() {
    }
    
    public final void marcar(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}