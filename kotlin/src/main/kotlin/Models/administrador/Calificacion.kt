package estudiante.kt.Models.secretario

import estudiante.kt.Models.Instructor.Estudiante
import estudiante.kt.Models.administrador.Curso

data class Calificacion(
    val id: String,
    val nota: Double,
    val observaciones: String?,
    val estudiante: Estudiante,
    val curso: Curso
)