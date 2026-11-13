Descripción del cambio
Problema

La agenda tenía cuatro fallas visibles para el usuario y una estructura que impedía corregirlas bien:

Cada sincronización borraba todas las favoritas.
Las charlas retiradas nunca se eliminaban.
Una falla de red ocultaba la lista.
Los filtros se perdían al abrir una ficha, rotar o morir el proceso.
Se disparaban descargas de más (rotación, cambio de pestaña, doble toque).
La capa de datos se instanciaba dentro del ViewModel.
Cambios por pedido

41 · Programa sin señal

Se agrega la tabla sync_estado para distinguir «nunca descargué» de «descargué una edición vacía (v4)».
Con edición previa, una falla conserva lista, detalle y favoritas, y muestra «Sin conexión: se muestran datos guardados».
Sin edición previa se ofrece «Reintentar».
Una v4 exitosa muestra «Sin charlas programadas» y sigue siendo válida al reabrir sin señal.
Se capturan todas las excepciones de red y de parseo (antes solo IOException) y se re-lanza CancellationException.

42 · Agenda personal

La sincronización se aplica en una única transacción: IGNORE para insertar nuevas, UPDATE parcial del contenido (sin tocar favorita) y DELETE de las charlas ausentes.
Esto conserva las marcas de las charlas vigentes, elimina las retiradas y hace que una charla que regresa lo haga sin marcar.
Una marca cambiada durante una petición se respeta.
Si la ficha abierta se retira, se cierra sola.

43 · Volver al punto de lectura

Los filtros dia y tema pasan al ViewModel con SavedStateHandle: sobreviven a abrir una ficha, rotar y matar el proceso.
Una tarea nueva arranca sin filtros.

44 · Control de descargas

Se eliminan la recarga en onStart() y el LaunchedEffect de Catalogo.
La carga automática ocurre una vez por proceso (SesionDescargas).
Las actualizaciones explícitas usan petición única en el repositorio (AtomicBoolean), así que dos toques durante una petición suman un solo intento.
Los filtros siguen editables durante la espera.
Persistencia
Room pasa de la versión 1 a la 2 con MIGRACION_1_2, sin migración destructiva.
Las instalaciones que ya tienen charlas guardadas se tratan como «con edición previa».
CharlaEntity conserva el esquema anterior.
Arquitectura
Se crean las capas domain (modelos, interfaz AgendaRepository, filtrarCharlas), data (remote, local, mapper, repository) y presentation (ProgramaViewModel, ProgramaUi, SesionDescargas).
JornadasApp y AppContainer pasan a ser la única raíz de composición, y el contenedor es único por proceso.
La UI depende de abstracciones (AgendaRepository, ControlMesa) y no de clases concretas.
El dominio ya no importa nada de data.
Portada y Catalogo pasan a ser puros: reciben estado y callbacks (ProgramaUi.Cargando / Listo).