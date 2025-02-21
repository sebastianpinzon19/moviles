import estudiante.kt.Models.Instructor.Estudiante

class EstudianteValidator EstudianteValidator {

    fun validarEstudiante(estudiante: Estudiante): Boolean {
        if (estudiante.nombre.isBlank() || estudiante.apellido.isBlank()) {
            println("Error: El nombre y apellido no pueden estar vacíos.")
            return false
        }
        if (!estudiante.estado) {
            println("Error: El estudiante debe estar activo.")
            return false
        }
        return true
    }
}