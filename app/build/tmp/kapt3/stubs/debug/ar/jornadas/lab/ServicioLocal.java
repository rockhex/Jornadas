package ar.jornadas.lab;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00158V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006!"}, d2 = {"Lar/jornadas/lab/ServicioLocal;", "Lokhttp3/Interceptor;", "Lar/jornadas/lab/ControlMesa;", "app", "Landroid/content/Context;", "(Landroid/content/Context;)V", "config", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "value", "", "demoraLarga", "getDemoraLarga", "()Z", "setDemoraLarga", "(Z)V", "disponible", "getDisponible", "setDisponible", "llamadas", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getLlamadas", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "revision", "getRevision", "()I", "setRevision", "(I)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_debug"})
public final class ServicioLocal implements okhttp3.Interceptor, ar.jornadas.lab.ControlMesa {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context app = null;
    private final android.content.SharedPreferences config = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> llamadas = null;
    
    public ServicioLocal(@org.jetbrains.annotations.NotNull()
    android.content.Context app) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> getLlamadas() {
        return null;
    }
    
    @java.lang.Override()
    public int getRevision() {
        return 0;
    }
    
    @java.lang.Override()
    public void setRevision(int value) {
    }
    
    @java.lang.Override()
    public boolean getDisponible() {
        return false;
    }
    
    @java.lang.Override()
    public void setDisponible(boolean value) {
    }
    
    @java.lang.Override()
    public boolean getDemoraLarga() {
        return false;
    }
    
    @java.lang.Override()
    public void setDemoraLarga(boolean value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
}