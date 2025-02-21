package question

object EdicionValidator {

    fun validarEdicion(
        titulo: String,
        fechaInicio: String,
        fechaFin: String,
        estado: Boolean
    ): Boolean {
        if (titulo.isBlank()) {
            println("Error: El título de la edición no puede estar vacío.")
            return false
        }
        if (!fechaInicio.matches(Regex("\\d{4}-\\d{2}-\\d{2}"))) {
            println("Error: La fecha de inicio debe estar en formato yyyy-MM-dd.")
            return false
        }
        if (!fechaFin.matches(Regex("\\d{4}-\\d{2}-\\d{2}"))) {
            println("Error: La fecha de fin debe estar en formato yyyy-MM-dd.")
            return false
        }
        if (!estado) {
            println("Error: La edición debe estar activa.")
            return false
        }
        return true
    }
}