package question

object ComandoValidator {

    fun validarComando(
        nombreComando: String,
        estadoComando: Boolean,
        ubicacionComando: String,
        fundacionId: String,
        brigadas: List<String>
    ): Boolean {
        if (nombreComando.isBlank()) {
            println("Error: El nombre del comando no puede estar vacío.")
            return false
        }
        if (!estadoComando) {
            println("Error: El comando debe estar activo.")
            return false
        }
        if (ubicacionComando.isBlank()) {
            println("Error: La ubicación del comando no puede estar vacía.")
            return false
        }
        if (fundacionId.isBlank()) {
            println("Error: El fundación asociada al comando no es válida.")
            return false
        }
        if (brigadas.isEmpty()) {
            println("Error: El comando debe tener al menos una brigada asociada.")
            return false
        }
        return true
    }
}