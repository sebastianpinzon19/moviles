package question

object UtilsValidator {

    fun validarTexto(texto: String): Boolean {
        if (texto.isBlank()) {
            println("Error: El texto no puede estar vacío.")
            return false
        }
        return true
    }

    fun validarCorreo(correo: String): Boolean {
        if (!correo.matches(Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\$"))) {
            println("Error: El correo electrónico es inválido.")
            return false
        }
        return true
    }

    fun validarFecha(fecha: String): Boolean {
        if (!fecha.matches(Regex("\\d{4}-\\d{2}-\\d{2}"))) {
            println("Error: La fecha debe estar en el formato yyyy-MM-dd.")
            return false
        }
        return true
    }
}