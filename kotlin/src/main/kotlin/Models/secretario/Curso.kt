package estudiante.kt.Models.administrador

import estudiante.kt.Models.secretario.Edicion

data class Curso(
    val id: String,
    val nombre: String,
    val descripcion: String,
    val estado: Boolean,
    val edicion: Edicion
)