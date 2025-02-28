package question

// Clase que maneja la asistencia
class Asistencia(val estudiante: Estudiante) {
    fun marcarAsistencia() {
        estudiante.asistencia = true  // Marcar como presente
    }

    fun marcarFalta() {
        estudiante.asistencia = false  // Marcar como ausente
    }
}
