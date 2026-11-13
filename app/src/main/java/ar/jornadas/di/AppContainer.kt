// di/AppContainer.kt   (ya no contiene JornadasApp)
package ar.jornadas.di

import android.content.Context
import androidx.room.Room
import ar.jornadas.data.local.Archivo
import ar.jornadas.data.local.MIGRACION_1_2
import ar.jornadas.data.remote.ProgramaApi
import ar.jornadas.data.repository.AgendaRepositoryImpl
import ar.jornadas.domain.repository.AgendaRepository
import ar.jornadas.lab.ControlMesa
import ar.jornadas.lab.ServicioLocal
import ar.jornadas.presentation.SesionDescargas
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AppContainer(context: Context) {
    private val app = context.applicationContext
    private val servicioLocal = ServicioLocal(app)
    val mesa: ControlMesa = servicioLocal                 // el resto de la app ve solo la interfaz
    private val db = Room.databaseBuilder(app, Archivo::class.java, "cartelera.db")
        .addMigrations(MIGRACION_1_2).build()
    private val api = Retrofit.Builder().baseUrl("https://programa.invalid/")
        .client(OkHttpClient.Builder().addInterceptor(servicioLocal).build())
        .addConverterFactory(GsonConverterFactory.create()).build()
        .create(ProgramaApi::class.java)
    val agenda: AgendaRepository = AgendaRepositoryImpl(api, db.cartelera())
    val sesion = SesionDescargas()
}