package estudiante.kt.Models.secretario

import estudiante.kt.Models.administrador.Unidad

class Horario(
    val id: String,
    val dia: String,
    val horaInicio: String,
    val horaFin: String,
    val unidad: Unidad
)