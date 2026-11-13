package ar.jornadas.domain.usecase

// domain/usecase/FiltrarCharlas.kt   (sale de Catalogo.kt:31, regla pura y testeable)
import ar.jornadas.domain.model.Charla

fun filtrarCharlas(charlas: List<Charla>, dia: Int, tema: String) =
    charlas.filter { (dia == 0 || it.dia == dia) && (tema == "Todos" || it.tema == tema) }