package estudiante.kt.Models.administrador

import estudiante.kt.Models.Instructor.Asistencia


class AsistenciaAdministrador(
    val idGlobal: String = "Global001",         // ID global para un registro administrativo
    val rangoFechas: String = "2023-01-01 a 2023-12-31", // Rango de fechas asociado
    val asistencias: List<Asistencia> // Reutiliza la clase Asistencia de Instructor
)