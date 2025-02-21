package question

object AsistenciaValidator {

    fun validarAsistencia(
        tituloAsistencia: String,
        fechaAsistencia: String,
        estadoAsistencia: Boolean,
        estudiantes: List<String>
    ): Boolean {
        if (tituloAsistencia.isBlank()) {
            println("Error: El título de la asistencia no puede estar vacío.")
            return false
        }
        if (!fechaAsistencia.matches(Regex("\\d{4}-\\d{2}-\\d{2}"))) {
            println("Error: La fecha de asistencia debe estar en el formato yyyy-MM-dd.")
            return false
        }
        if (!estadoAsistencia) {
            println("Error: El registro de asistencia debe estar activo.")
            return false
        }
        if (estudiantes.isEmpty()) {
            println("Error: La asistencia debe tener al menos un estudiante asociado.")
            return false
        }
        return true
    }
}