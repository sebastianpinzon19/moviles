package estudiante.kt

import estudiante.kt.Models.secretario.*
import estudiante.kt.Models.administrador.*

fun main() {
    println("==========================================")
    println("            SISTEMA DE GESTIÓN")
    println("==========================================")

    // Llamadas para mostrar las tablas:
    mostrarTablaCursos()
    mostrarTablaAsistencias()
    mostrarTablaFundaciones()
    mostrarTablaHorarios()
    mostrarTablaEdiciones()
    mostrarTablaCertificados()
    mostrarTablaCalificaciones()
    mostrarTablaColegios()
    mostrarTablaBrigadas()
    mostrarTablaAuditorias()
    mostrarTablaComandos()
    mostrarTablaUnidades()
    mostrarTablaEstudiantes()
    mostrarTablaUsuarios()
}

// Funciones para tablas (14 en total)

fun mostrarTablaCursos() {
    val curso = Curso()
    println("\n--- Tabla de Cursos ---")
    println("| ID        | Nombre               | Descripción                     | Intensidad  | Estado | Fundación ID |")
    println("|-----------|----------------------|---------------------------------|-------------|--------|--------------|")
    println("| ${curso._id} | ${curso.nombreCurso} | ${curso.descripcionCurso} | ${curso.intensidadHorariaCurso} | ${curso.estadoCurso}   | ${curso.fundacionId}       |")
}

fun mostrarTablaAsistencias() {
    val asistencia = Asistencia()
    println("\n--- Tabla de Asistencias ---")
    println("| ID       | Título              | Fecha       | Usuario ID | Estado | Estudiantes                |")
    println("|----------|---------------------|-------------|------------|--------|---------------------------|")
    println("| ${asistencia._id} | ${asistencia.tituloAsistencia} | ${asistencia.fechaAsistencia} | ${asistencia.usuarioId} | ${asistencia.estadoAsistencia}   | ${asistencia.estudiantes.joinToString(", ")} |")
}

fun mostrarTablaFundaciones() {
    val fundacion = Fundacion()
    println("\n--- Tabla de Fundaciones ---")
    println("| Nombre Fundación | Estado | Comandos          |")
    println("|------------------|--------|-------------------|")
    println("| ${fundacion.nombreFundacion}         | ${fundacion.estadoFundacion}  | ${fundacion.comando?.joinToString(", ") ?: "N/A"} |")
}

fun mostrarTablaHorarios() {
    val horario = Horario()
    println("\n--- Tabla de Horarios ---")
    println("| Título         | Hora Inicio | Hora Fin | Estado |")
    println("|----------------|-------------|----------|--------|")
    println("| ${horario.tituloHorario} | ${horario.horaInicio}       | ${horario.horaFin}  | ${horario.estadoHorario}   |")
}

fun mostrarTablaEdiciones() {
    val edicion = Edicion()
    println("\n--- Tabla de Ediciones ---")
    println("| Título         | Fecha Inicio | Fecha Fin | Estado | Curso ID | Horarios                  |")
    println("|----------------|--------------|-----------|--------|----------|---------------------------|")
    println("| ${edicion.tituloEdicion} | ${edicion.fechaInicioEdicion} | ${edicion.fechaFinEdicion} | ${edicion.estadoEdicion}  | ${edicion.cursoId} | ${edicion.horarios.joinToString(", ")} |")
}

fun mostrarTablaCertificados() {
    val certificado = Certificado()
    println("\n--- Tabla de Certificados ---")
    println("| ID      | Fecha Emisión | Usuario ID | Curso ID | Estudiante ID | Emisor           | Código Verificación | Estado |")
    println("|---------|---------------|------------|----------|---------------|------------------|---------------------|--------|")
    println("| ${certificado._id} | ${certificado.fechaEmision} | ${certificado.usuarioId} | ${certificado.cursoId} | ${certificado.estudianteId} | ${certificado.nombreEmisorCertificado} | ${certificado.codigoVerificacion} | ${certificado.estadoCertificado} |")
}

fun mostrarTablaCalificaciones() {
    val calificacion = Calificacion()
    println("\n--- Tabla de Calificaciones ---")
    println("| ID      | Título           | Aprobado | Usuario ID | Estado | Estudiantes                |")
    println("|---------|------------------|----------|------------|--------|---------------------------|")
    println("| ${calificacion._id} | ${calificacion.tituloCalificacion} | ${calificacion.aprobado}       | ${calificacion.usuarioId} | ${calificacion.estadoCalificacion}   | ${calificacion.estudiantes.joinToString(", ")} |")
}

fun mostrarTablaColegios() {
    val colegio = Colegio()
    println("\n--- Tabla de Colegios ---")
    println("| ID      | Nombre Colegio               | Email                   | Estado | Estudiantes         |")
    println("|---------|------------------------------|-------------------------|--------|---------------------|")
    println("| ${colegio._id} | ${colegio.nombreColegio} | ${colegio.emailColegio} | ${colegio.estadoColegio}   | ${colegio.estudiantes.joinToString(", ")} |")
}

fun mostrarTablaBrigadas() {
    val brigada = Brigada()
    println("\n--- Tabla de Brigadas ---")
    println("| ID      | Nombre Brigada   | Ubicación             | Estado | Comando ID | Unidades         |")
    println("|---------|------------------|-----------------------|--------|-----------|------------------|")
    println("| ${brigada._id} | ${brigada.nombreBrigada} | ${brigada.ubicacionBrigada} | ${brigada.estadoBrigada}   | ${brigada.comandoId} | ${brigada.unidades.joinToString(", ")} |")
}

fun mostrarTablaAuditorias() {
    val auditoria = Auditoria()
    println("\n--- Tabla de Auditorias ---")
    println("| ID      | Fecha Auditoria  | Emisor              | Certificado ID | Estado |")
    println("|---------|------------------|---------------------|----------------|--------|")
    println("| ${auditoria._id} | ${auditoria.fechaAuditoria}   | ${auditoria.nombreEmisor} | ${auditoria.certificadoId} | ${auditoria.estadoAuditoria} |")
}

fun mostrarTablaComandos() {
    val comando = Comando()
    println("\n--- Tabla de Comandos ---")
    println("| ID      | Nombre Comando   | Ubicación          | Estado | Fundación ID | Brigadas         |")
    println("|---------|------------------|--------------------|--------|--------------|------------------|")
    println("| ${comando._id} | ${comando.nombreComando} | ${comando.ubicacionComando} | ${comando.estadoComando}   | ${comando.fundacionId}    | ${comando.brigadas.joinToString(", ")} |")
}

fun mostrarTablaUnidades() {
    val unidad = Unidad()
    println("\n--- Tabla de Unidades ---")
    println("| ID      | Nombre Unidad      | Estado | Brigada ID | Usuario ID | Estudiantes         |")
    println("|---------|--------------------|--------|------------|------------|---------------------|")
    println("| ${unidad._id} | ${unidad.nombreUnidad}  | ${unidad.estadoUnidad}   | ${unidad.brigadaId} | ${unidad.usuarioId} | ${unidad.estudiantes.joinToString(", ")} |")
}

fun mostrarTablaEstudiantes() {
    val estudiante = Estudiante()
    println("\n--- Tabla de Estudiantes ---")
    println("| ID        | Nombre  | Apellido | Correo                  | Numero Documento | Estado |")
    println("|-----------|---------|----------|------------------------|------------------|--------|")
    println("| ${estudiante._id} | ${estudiante.nombreEstudiante}  | ${estudiante.apellidoEstudiante} | ${estudiante.correoEstudiante} | ${estudiante.numeroDocumento}  | ${estudiante.estadoEstudiante} |")
}

fun mostrarTablaUsuarios() {
    val usuario = Usuario()
    println("\n--- Tabla de Usuarios ---")
    println("| Nombre   | Apellido | Documento   | Correo                   | Roles        | Estado | Creado En |")
    println("|----------|----------|-------------|--------------------------|--------------|--------|-----------|")
    println("| ${usuario.nombreUsuario}  | ${usuario.apellidoUsuario}  | ${usuario.numeroDocumento} | ${usuario.correo} | ${usuario.roles.joinToString(", ")} | ${usuario.estadoUsuario} | ${usuario.creadoEn} |")
}