package estudiante.kt.Models.administrador

data class Comando (
    val _id : String,
    val nombreComando : String,
    val estadoComando : String,
    val ubicacionComando : String,
    val fundacionId : String, // Relación con una fundación
    val brigadas : List<Brigada>
)
