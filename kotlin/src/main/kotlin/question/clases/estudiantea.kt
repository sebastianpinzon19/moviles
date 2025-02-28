// Estudiante.kt
package question

data class Estudiante(
    val nombre: String,
    val edad: Int,
    var calificacion: Double,
    var asistencia: Boolean // Indicamos si el estudiante tiene asistencia completa o no
) {

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad, Calificación: $calificacion, Asistencia: ${if (asistencia) "Completa" else "Incompleta"}"
    }
}