package estudiante.kt.Models.secretario

class Estudiante {
    val _id = "Estudiante001"
    val nombreEstudiante = "Juan"
    val apellidoEstudiante = "Pérez"
    val correoEstudiante = "juan.perez@ejemplo.com"
    val tipoDocumento = "Cédula"
    val numeroDocumento = "123456789"
    val fechaNacimiento = "2000-01-01"
    val generoEstudiante = "Masculino"
    val unidadId = Unidad()
    val colegioId = Colegio()
    val estadoEstudiante = true
    val ediciones = listOf(Edicion())
    val calificaciones = listOf(Calificacion())
    val asistencias = listOf(Asistencia())
    val certificados = listOf(Certificado())
}