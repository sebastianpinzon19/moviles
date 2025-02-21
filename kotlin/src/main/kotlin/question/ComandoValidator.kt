package question

object ComandoValidator {

    /**
     * Valida parámetros necesarios para ejecutar un comando del sistema.
     *
     * @param nombreComando Nombre del comando
     * @param parametros Parámetros asociados al comando
     * @return true si los datos son válidos
     */
    fun validarComando(nombreComando: String, parametros: Map<String, String>): Boolean {
        require(nombreComando.isNotBlank()) { "El nombre del comando no puede estar vacío." }
        require(parametros.isNotEmpty()) { "Los parámetros no pueden estar vacíos." }

        parametros.forEach { (key, value) ->
            require(key.isNotBlank()) { "La clave del parámetro '$key' no puede estar vacía." }
            require(value.isNotBlank()) { "El valor del parámetro '$value' no puede estar vacío." }
        }

        return true
    }
}