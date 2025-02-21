package question

object BrigadaValidator {

    fun validarBrigada(
        nombre: String,
        ubicacion: String,
        estado: Boolean
    ): Boolean {
        if (nombre.isBlank()) {
            println("Error: El nombre de la brigada no puede estar vacío.")
            return false
        }
        if (ubicacion.isBlank()) {
            println("Error: La ubicación no puede estar vacía.")
            return false
        }
        if (!estado) {
            println("Error: La brigada debe estar activa.")
            return false
        }
        return true
    }
}