package question

object UnidadValidator {

    fun validarUnidad(
        nombreUnidad: String,
        estadoUnidad: Boolean,
        brigadaId: String,
        usuarioId: String,
        estudiantes: List<String>
    ): Boolean {
        // Validar que el nombre no esté vacío
        if (nombreUnidad.isBlank()) {
            println("Error: El nombre de la unidad no puede estar vacío.")
            return false
        }

        // Validar que la unidad esté activa
        if (!estadoUnidad) {
            println("Error: La unidad debe estar activa.")
            return false
        }

        // Validar que el ID de la brigada sea válido
        if (brigadaId.isBlank()) {
            println("Error: El ID de la brigada no es válido.")
            return false
        }

        // Validar que el ID del usuario sea válido
        if (usuarioId.isBlank()) {
            println("Error: El ID del usuario no es válido.")
            return false
        }

        // Validar que haya al menos un estudiante en la lista
        if (estudiantes.isEmpty()) {
            println("Error: La unidad debe tener al menos un estudiante asociado.")
            return false
        }

        return true // Si pasa todas las validaciones, la unidad es válida
    }
}