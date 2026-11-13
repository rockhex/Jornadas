package ar.jornadas.ui

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ar.jornadas.presentation.Aviso
import ar.jornadas.presentation.ProgramaUi
import ar.jornadas.domain.model.Charla
@Composable
fun Catalogo(ui: ProgramaUi.Listo, dia: Int, tema: String,
             onDia: (Int) -> Unit, onTema: (String) -> Unit,
             onActualizar: () -> Unit, abrir: (String) -> Unit) {
    Selector(listOf("Ambos días", "Día 1", "Día 2"), dia, onDia)
    val temas = listOf("Todos", "Android", "Datos", "Calidad")
    Selector(temas, temas.indexOf(tema)) { onTema(temas[it]) }
    TextButton(onClick = onActualizar) { Text("Actualizar") }
    if (ui.sincronizando) LinearProgressIndicator(Modifier.fillMaxWidth())

    when (ui.aviso) {
        Aviso.DatosGuardados -> Text("Sin conexión: se muestran datos guardados")
        Aviso.SinDescargaPrevia -> {
            Text("No se pudo consultar el programa")
            OutlinedButton(onClick = onActualizar) { Text("Reintentar") }
        }
        null -> Unit
    }
    when {
        !ui.hayEdicion -> Unit                                   // sin descarga previa: no hay lista
        ui.todas.isEmpty() -> Text("Sin charlas programadas")    // v4 válida
        ui.visibles.isEmpty() -> Text("Ninguna charla coincide con los filtros")
        else -> Grilla(ui.visibles, abrir)                       // lista visible con o sin falla
    }
}

@Composable
private fun Selector(opciones: List<String>, indice: Int, elegir: (Int) -> Unit) {
    Row(Modifier.horizontalScroll(rememberScrollState()), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
        opciones.forEachIndexed { i, texto ->
            FilterChip(selected = i == indice, onClick = { elegir(i) }, label = { Text(texto) })
        }
    }
}

@Composable
fun Grilla(fichas: List<Charla>, abrir: (String) -> Unit) {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(bottom = 12.dp)) {
        items(fichas, key = { it.id }) { ficha ->
            ElevatedCard(onClick = { abrir(ficha.id) }, modifier = Modifier.fillMaxWidth()) {
                Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text("Día ${ficha.dia} · ${ficha.hora} · ${ficha.sala}", style = MaterialTheme.typography.labelMedium)
                    Text(ficha.titulo, style = MaterialTheme.typography.titleLarge)
                    Text(if (ficha.favorita) "${ficha.tema} · En mi agenda" else ficha.tema)
                }
            }
        }
    }
}
