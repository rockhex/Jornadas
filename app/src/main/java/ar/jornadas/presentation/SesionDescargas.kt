package ar.jornadas.presentation

import java.util.concurrent.atomic.AtomicBoolean

class SesionDescargas {
    private val hecha = AtomicBoolean(false)
    fun reclamarCargaAutomatica() = hecha.compareAndSet(false, true)
}