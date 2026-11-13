package ar.jornadas.lab

import kotlinx.coroutines.flow.StateFlow

interface ControlMesa {
    val llamadas: StateFlow<Int>
    var disponible: Boolean
    var revision: Int
    var demoraLarga: Boolean
}