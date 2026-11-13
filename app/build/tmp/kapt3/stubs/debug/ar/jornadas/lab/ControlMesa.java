package ar.jornadas.lab;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\rX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lar/jornadas/lab/ControlMesa;", "", "demoraLarga", "", "getDemoraLarga", "()Z", "setDemoraLarga", "(Z)V", "disponible", "getDisponible", "setDisponible", "llamadas", "Lkotlinx/coroutines/flow/StateFlow;", "", "getLlamadas", "()Lkotlinx/coroutines/flow/StateFlow;", "revision", "getRevision", "()I", "setRevision", "(I)V", "app_debug"})
public abstract interface ControlMesa {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getLlamadas();
    
    public abstract boolean getDisponible();
    
    public abstract void setDisponible(boolean p0);
    
    public abstract int getRevision();
    
    public abstract void setRevision(int p0);
    
    public abstract boolean getDemoraLarga();
    
    public abstract void setDemoraLarga(boolean p0);
}