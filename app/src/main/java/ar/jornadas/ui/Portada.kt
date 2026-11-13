package ar.jornadas.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import ar.jornadas.domain.model.Charla
import ar.jornadas.lab.ControlMesa
import ar.jornadas.presentation.ProgramaUi
import ar.jornadas.presentation.ProgramaViewModel

@Composable
fun Portada(model: ProgramaViewModel, mesa: ControlMesa) {
    var seccion by rememberSaveable { mutableStateOf("Programa") }
    var detalle by rememberSaveable { mutableStateOf<String?>(null) }

    val ui by model.ui.collectAsStateWithLifecycle()
    val dia by model.dia.collectAsStateWithLifecycle()
    val tema by model.tema.collectAsStateWithLifecycle()
    val estado = ui   // copia local para poder usar smart-cast en los `when`

    // Si la charla abierta ya no existe en el programa (se retiró), cerramos la ficha.
    LaunchedEffect(estado, detalle) {
        val listo = estado as? ProgramaUi.Listo ?: return@LaunchedEffect
        val abierta = detalle ?: return@LaunchedEffect
        if (listo.todas.none { it.id == abierta }) detalle = null
    }

    BackHandler(detalle != null || seccion != "Programa") {
        if (detalle != null) detalle = null else seccion = "Programa"
    }

    MaterialTheme(colorScheme = lightColorScheme(primary = Color(0xFF185B54), secondary = Color(0xFF995136))) {
        Scaffold(bottomBar = {
            if (detalle == null) NavigationBar {
                listOf("Programa" to "▤", "Mi agenda" to "☆", "Mesa" to "⚙").forEach { (nombre, icono) ->
                    NavigationBarItem(seccion == nombre, { seccion = nombre },
                        icon = { Text(icono) }, label = { Text(nombre) })
                }
            }
        }) { margen ->
            Column(Modifier.fillMaxSize().padding(margen).padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Spacer(Modifier.height(8.dp))
                Text("Jornadas del Sur", style = MaterialTheme.typography.labelLarge)

                if (detalle != null) {
                    TextButton(onClick = { detalle = null }) { Text("Volver") }
                    when (estado) {
                        ProgramaUi.Cargando -> LinearProgressIndicator(Modifier.fillMaxWidth())
                        is ProgramaUi.Listo -> {
                            val ficha = estado.todas.find { it.id == detalle }
                            if (ficha != null) Detalle(ficha) { model.marcar(ficha.id) }
                        }
                    }
                } else {
                    Text(seccion, style = MaterialTheme.typography.headlineLarge)
                    when (seccion) {
                        "Programa" -> when (estado) {
                            ProgramaUi.Cargando -> LinearProgressIndicator(Modifier.fillMaxWidth())
                            is ProgramaUi.Listo -> Catalogo(
                                ui = estado, dia = dia, tema = tema,
                                onDia = model::elegirDia,
                                onTema = model::elegirTema,
                                onActualizar = model::actualizar,
                                abrir = { detalle = it },
                            )
                        }
                        "Mi agenda" -> when (estado) {
                            ProgramaUi.Cargando -> LinearProgressIndicator(Modifier.fillMaxWidth())
                            is ProgramaUi.Listo -> {
                                val guardadas = estado.todas.filter { it.favorita }
                                if (guardadas.isEmpty()) Text("Todavía no agregaste charlas.")
                                Grilla(guardadas) { detalle = it }
                            }
                        }
                        else -> Mesa(mesa)
                    }
                }
            }
        }
    }
}

@Composable
private fun Detalle(ficha: Charla, alMarcar: () -> Unit) {
    Column(Modifier.verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text(ficha.titulo, style = MaterialTheme.typography.headlineMedium)
        Text("Día ${ficha.dia} · ${ficha.hora} · ${ficha.sala}")
        Text(ficha.ponente, style = MaterialTheme.typography.titleMedium)
        Text(ficha.resumen)
        Button(onClick = alMarcar) {
            Text(if (ficha.favorita) "Quitar de mi agenda" else "Agregar a mi agenda")
        }
    }
}