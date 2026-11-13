package ar.jornadas.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001aj\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a*\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a2\u0010\u0012\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\tH\u0003\u00a8\u0006\u0016"}, d2 = {"Catalogo", "", "ui", "Lar/jornadas/presentation/ProgramaUi$Listo;", "dia", "", "tema", "", "onDia", "Lkotlin/Function1;", "onTema", "onActualizar", "Lkotlin/Function0;", "abrir", "Grilla", "fichas", "", "Lar/jornadas/domain/model/Charla;", "Selector", "opciones", "indice", "elegir", "app_debug"})
public final class CatalogoKt {
    
    @androidx.compose.runtime.Composable()
    public static final void Catalogo(@org.jetbrains.annotations.NotNull()
    ar.jornadas.presentation.ProgramaUi.Listo ui, int dia, @org.jetbrains.annotations.NotNull()
    java.lang.String tema, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onDia, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTema, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onActualizar, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> abrir) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void Selector(java.util.List<java.lang.String> opciones, int indice, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> elegir) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Grilla(@org.jetbrains.annotations.NotNull()
    java.util.List<ar.jornadas.domain.model.Charla> fichas, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> abrir) {
    }
}