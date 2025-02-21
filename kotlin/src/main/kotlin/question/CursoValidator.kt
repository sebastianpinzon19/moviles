package question

import estudiante.kt.Models.administrador.Curso

class CursoValidator {

    fun validarCurso(curso: Curso
    ): Boolean {
        if (curso.nombre.isBlank()) {
            println("Error: El nombre del curso no puede estar vacío.")
            return false
        }

        if (curso.estado) {
            println("Error: El curso debe estar activo.")
            return false
        }
        return true
    }
}