package estudiante.kt.Models.administrador

class Comando {
    val _id = "67890"
    val nombreComando = "Comando Ejemplo"
    val estadoComando = true
    val ubicacionComando = "Ciudad Ejemplo"
    val fundacionId = "Fundacion001" // Relación con una fundación
    val brigadas = listOf("Brigada001", "Brigada002")
}
