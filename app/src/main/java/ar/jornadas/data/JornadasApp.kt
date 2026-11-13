package ar.jornadas.data

import android.app.Application
import ar.jornadas.di.AppContainer



class JornadasApp : Application() { val container by lazy { AppContainer(this) } }