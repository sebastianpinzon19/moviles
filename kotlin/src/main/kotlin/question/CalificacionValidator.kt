package question

object CalificacionValidator {

    fun validarCalificacion(
        tituloCalificacion: String,
        aprobado: Boolean,
        estadoCalificacion: Boolean,
        estudiantes: List<String>
    ): Boolean {
        if (tituloCalificacion.isBlank()) {
            println("Error: El título de la calificación no puede estar vacío.")
            return false
        }
        if (!estadoCalificacion) {
            println("Error: La calificación debe estar activa.")
            return false
        }
        if (estudiantes.isEmpty()) {
            println("Error: La calificación debe asociarse a al menos un estudiante.")
            return false
        }
        return true
    }
}