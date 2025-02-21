package question

object ModuloValidator {

    fun validarModulo(nombre: String, descripcion: String): Boolean {
        if (nombre.isBlank()) {
            println("Error: El nombre del módulo no puede estar vacío.")
            return false
        }
        if (descripcion.isBlank()) {
            println("Error: La descripción del módulo no puede estar vacía.")
            return false
        }
        return true
    }
}