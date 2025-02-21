package estudiante.kt.Validators

import estudiante.kt.Models.administrador.Colegio

object ColegioValidator {

    fun validarColegio(colegio: Colegio): Boolean {
        // Validar que el nombre no esté vacío
        if (colegio.nombre.isBlank()) {
            println("Error: El nombre del colegio no puede estar vacío.")
            return false
        }

        // Validar que la dirección no esté vacía
        if (colegio.direccion.isBlank()) {
            println("Error: La dirección del colegio no puede estar vacía.")
            return false
        }

        // Validar que el teléfono no esté vacío y sea válido
        if (colegio.telefono.isBlank()) {
            println("Error: El teléfono del colegio no puede estar vacío.")
            return false
        }

        // Validar que el colegio esté activo
        if (!colegio.estado) {
            println("Error: El colegio debe estar activo.")
            return false
        }

        // Si pasa todas las validaciones, el colegio es válido
        return true
    }
}