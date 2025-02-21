package estudiante.kt.Validators

import estudiante.kt.Models.secretario.Edicion

object EdicionValidator {

    fun validarEdicion(edicion: Edicion): Boolean {
        // Validar que el título no esté vacío
        if (edicion.titulo.isBlank()) {
            println("Error: El título de la edición no puede estar vacío.")
            return false
        }

        // Validar el formato de la fecha de inicio
        if (!edicion.fechaInicio.matches(Regex("\\d{4}-\\d{2}-\\d{2}"))) {
            println("Error: La fecha de inicio debe estar en formato yyyy-MM-dd.")
            return false
        }

        // Validar el formato de la fecha de fin
        if (!edicion.fechaFin.matches(Regex("\\d{4}-\\d{2}-\\d{2}"))) {
            println("Error: La fecha de fin debe estar en formato yyyy-MM-dd.")
            return false
        }

        // Validar que la edición esté activa
        if (!edicion.estado) {
            println("Error: La edición debe estar activa.")
            return false
        }

        // Si pasa todas las validaciones, la edición es válida
        return true
    }
}