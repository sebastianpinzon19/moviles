package models.administrativo

class unidad (
    val _id: String,
    val nombreUnidad: String,
    val estadoUnidad: Boolean,
    val usuarioId: String,
    val estudiantes: List<String>
)