package question

object FundacionValidator {

    fun validarFundacion(
        nombre: String,
        estado: Boolean
    ): Boolean {
        if (nombre.isBlank()) {
            println("Error: El nombre de la fundación no puede estar vacío.")
            return false
        }
        if (!estado) {
            println("Error: La fundación debe estar activa.")
            return false
        }
        return true
    }
}