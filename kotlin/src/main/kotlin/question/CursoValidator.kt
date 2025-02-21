package question

object CursoValidator {

    fun validarCurso(
        nombre: String,
        descripcion: String,
        intensidadHoraria: String,
        estado: Boolean
    ): Boolean {
        if (nombre.isBlank()) {
            println("Error: El nombre del curso no puede estar vacío.")
            return false
        }
        if (descripcion.isBlank()) {
            println("Error: La descripción no puede estar vacía.")
            return false
        }
        if (!intensidadHoraria.matches(Regex("\\d+ horas"))) {
            println("Error: La intensidad horaria debe ser un número seguido de 'horas'.")
            return false
        }
        if (!estado) {
            println("Error: El curso debe estar activo.")
            return false
        }
        return true
    }
}