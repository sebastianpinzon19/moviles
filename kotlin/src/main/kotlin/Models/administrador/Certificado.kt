package estudiante.kt.Models.administrador

import estudiante.kt.Models.secretario.Estudiante

data class Certificado(
    val id: String,
    val fechaExpedicion: String,
    val descripcion: String,
    val estudiante: Estudiante
)