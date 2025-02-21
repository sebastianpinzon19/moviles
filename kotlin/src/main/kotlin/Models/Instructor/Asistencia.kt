package estudiante.kt.Models.Instructor

import estudiante.kt.Models.Instructor.Estudiante
import estudiante.kt.Models.secretario.Horario

data class Asistencia(
    val id: String,
    val fecha: String,
    val presente: Boolean,
    val estudiante: Estudiante,
    val horario: Horario
)