package estudiante.kt.Models.administrador

import estudiante.kt.Models.Instructor.Asistencia // Reutilizamos la clase de Instructor

class AsistenciaAdministrador(
    val idGlobal: String = "Global001",         // ID global para un registro administrativo
    val rangoFechas: String = "2023-01-01 a 2023-12-31", // Rango de fechas asociado
    val asistencias: List<Asistencia> = listOf() // Lista de asistencias del módulo Instructor
) {
    // Método para contabilizar el total de asistencias
    fun totalAsistencias(): Int {
        return asistencias.count { it.estadoAsistencia }
    }

    // Método para contabilizar el total de estudiantes únicos en las asistencias
    fun totalEstudiantesUnicos(): Int {
        return asistencias.flatMap { it.estudiantes }.distinct().size
    }
}