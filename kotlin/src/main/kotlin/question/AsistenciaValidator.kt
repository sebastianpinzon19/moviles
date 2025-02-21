package question

object AsistenciaValidator {

    /**
     * Valida los registros de asistencia.
     *
     * @param estudianteId ID del estudiante
     * @param fecha Fecha de asistencia
     * @param estado Estado de la asistencia (Presente, Ausente, Tardanza)
     * @return true si los datos son válidos
     */
    fun validarAsistencia(estudianteId: Int, fecha: String, estado: String): Boolean {
        require(estudianteId > 0) { "El ID del estudiante debe ser mayor a 0." }
        require(fecha.matches(Regex("\\d{4}-\\d{2}-\\d{2}"))) { "La fecha debe estar en el formato yyyy-MM-dd." }
        require(estado in listOf("Presente", "Ausente", "Tardanza")) { 
            "El estado de asistencia debe ser Presente, Ausente o Tardanza."
        }
        return true
    }
}