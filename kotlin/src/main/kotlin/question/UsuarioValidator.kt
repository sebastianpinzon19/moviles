package question

object UsuarioValidator {

    fun validarUsuario(
        nombre: String,
        apellido: String,
        correo: String,
        estado: Boolean,
        roles: List<String>
    ): Boolean {
        if (nombre.isBlank() || apellido.isBlank()) {
            println("Error: El nombre y apellido no pueden estar vacíos.")
            return false
        }
        if (!correo.matches(Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\$"))) {
            println("Error: El correo no es válido.")
            return false
        }
        if (!estado) {
            println("Error: El usuario debe estar activo.")
            return false
        }
        if (roles.isEmpty()) {
            println("Error: El usuario debe tener al menos un rol.")
            return false
        }
        return true
    }
}