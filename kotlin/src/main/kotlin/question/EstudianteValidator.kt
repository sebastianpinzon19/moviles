import estudiante.kt.Models.Instructor.Estudiante

object EstudianteValidator {

    fun validarEstudiante(estudiante: Estudiante): Boolean {
        if (estudiante.nombre.isBlank() || estudiante.apellido.isBlank()) {
            println("Error: El nombre y apellido no pueden estar vacíos.")
            return false
        }
        if (!estudiante.correo.matches(Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))) {
            println("Error: El correo no es válido.")
            return false
        }
        if (estudiante.numeroDocumento.isBlank()) {
            println("Error: El número de documento no puede estar vacío.")
            return false
        }
        if (!estudiante.estado) {
            println("Error: El estudiante debe estar activo.")
            return false
        }
        return true
    }
}