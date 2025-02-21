package question

import estudiante.kt.Models.secretario.Horario

object HorarioValidator {

    fun validarHorario(horario: Horario): Boolean {
        if (titulo.isBlank()) {
            println("Error: El título del horario no puede estar vacío.")
            return false
        }
        if (!horaInicio.matches(Regex("\\d{2}:\\d{2}"))) {
            println("Error: La hora de inicio debe estar en formato HH:mm.")
            return false
        }
        if (!horaFin.matches(Regex("\\d{2}:\\d{2}"))) {
            println("Error: La hora final debe estar en formato HH:mm.")
            return false
        }
        if (!estado) {
            println("Error: El horario debe estar activo.")
            return false
        }
        return true
    }
}