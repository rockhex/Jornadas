package ar.jornadas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import ar.jornadas.presentation.ProgramaViewModel
import ar.jornadas.ui.Portada

class MainActivity : ComponentActivity() {
    private val container get() = (application as JornadasApp).container

    private val model: ProgramaViewModel by viewModels {
        viewModelFactory {
            initializer {
                ProgramaViewModel(
                    repo = container.agenda,
                    sesion = container.sesion,
                    state = createSavedStateHandle(),
                )
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null && intent.hasExtra("servicio_disponible")) {
            container.mesa.disponible = intent.getBooleanExtra("servicio_disponible", true)
            intent.removeExtra("servicio_disponible")
        }
        setContent { Portada(model, container.mesa) }
    }
}