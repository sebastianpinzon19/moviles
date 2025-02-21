package question

object UnidadValidator {

    fun validarUnidad(
        nombre: String,
        estado: Boolean,
        brigadaId: String,
        usuarioId: String,
        estudiantes: List<String>
    ): Boolean {
        if (nombre.isBlank()) {
            println("Error: El nombre de la unidad no puede estar vacío.")
            return false
        }
        if (!estado) {
            println("Error: La unidad debe estar activa.")
            return false
        }
        if (brigadaId.isBlank()) {
            println("Error: La brigada asociada no puede estar vacía.")
            return false
        }
        if (usuarioId.isBlank()) {
            println("Error: El usuario asociado no puede estar vacío.")
            return false
        }
        if (estudiantes.isEmpty()) {
            println("Error: La unidad debe tener al menos un estudiante asociado.")
            return false
        }
        return true
    }
}