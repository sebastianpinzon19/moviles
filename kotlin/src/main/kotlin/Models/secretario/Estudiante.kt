package estudiante.kt.Models.secretario

class Estudiante {
    val _id = "Estudiante001"
    val nombreEstudiante = "Ana"
    val apellidoEstudiante = "García"
    val correoEstudiante = "ana.garcia@ejemplo.com"
    val numeroDocumento = "987654321"
    val estadoEstudiante = true
    val edicionId = Edicion()
    val colegioId = estudiante.kt.Models.administrador.Colegio()
}
