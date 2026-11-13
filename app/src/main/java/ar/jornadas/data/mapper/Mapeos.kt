package ar.jornadas.data.mapper

import ar.jornadas.data.local.CharlaEntity
import ar.jornadas.data.local.ContenidoCharla
import ar.jornadas.data.remote.FichaRemota
import ar.jornadas.domain.model.Charla

fun CharlaEntity.aDominio() = Charla(id, titulo, tema, dia, hora, sala, ponente, resumen, favorita)

fun FichaRemota.aContenido() = ContenidoCharla(
    id = id, titulo = title, tema = track, dia = day,
    hora = time, sala = room, ponente = speaker, resumen = summary,
)