package ar.jornadas.data.remote

import retrofit2.http.GET


interface ProgramaApi {
    @GET("programa") suspend fun consultar(): List<FichaRemota>
}