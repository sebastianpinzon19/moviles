package question

object AuditoriaValidator {

    fun validarAuditoria(usuario: String, accion: String, fecha: String): Boolean {
        if (usuario.isBlank()) {
            println("Error: El usuario no puede estar vacío.")
            return false
        }
        if (accion.isBlank()) {
            println("Error: La acción no puede estar vacía.")
            return false
        }
        if (!fecha.matches(Regex("\\d{4}-\\d{2}-\\d{2}"))) {
            println("Error: La fecha debe estar en el formato yyyy-MM-dd.")
            return false
        }
        return true
    }
}