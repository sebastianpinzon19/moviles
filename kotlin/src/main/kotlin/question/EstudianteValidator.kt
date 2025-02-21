package question

object EstudianteValidator {

    fun validarEstudiante(
        nombre: String,
        apellido: String,
        correo: String,
        numeroDocumento: String,
        estado: Boolean
    ): Boolean {
        if (nombre.isBlank() || apellido.isBlank()) {
            println("Error: El nombre y apellido no pueden estar vacíos.")
            return false
        }
        if (!correo.matches(Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\$"))) {
            println("Error: El correo proporcionado no es válido.")
            return false
        }
        if (!numeroDocumento.matches(Regex("\\d+"))) {
            println("Error: El número de documento solo puede contener dígitos.")
            return false
        }
        if (!estado) {
            println("Error: El estudiante debe estar activo.")
            return false
        }
        return true
    }
}