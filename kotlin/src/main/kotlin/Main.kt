package question

import estudiante.kt.Validators.EdicionValidator
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var salir = false

    while (!salir) {
        println("\n=== Menú de Validaciones ===")
        println("1. Validar Curso")
        println("2. Validar Estudiante")
        println("3. Validar Usuario")
        println("4. Validar Fundación")
        println("5. Validar Certificado")
        println("6. Validar Edición")
        println("7. Validar Horario")
        println("8. Validar Brigada")
        println("9. Ejecutar todas las validaciones")
        println("10. Validar Comando")
        println("11. Validar Calificación")
        println("12. Validar Asistencia")
        println("13. Validar Colegio")
        println("14. Validar Unidad")
        println("0. Salir")
        print("Elige una opción: ")

        val opcion = scanner.nextInt()
        scanner.nextLine() // Consumir el salto de línea sobrante

        when (opcion) {
            1 -> validarCurso(scanner)
            2 -> validarEstudiante(scanner)
            3 -> validarUsuario(scanner)
            4 -> validarFundacion(scanner)
            5 -> validarCertificado(scanner)
            6 -> validarEdicion(scanner)
            7 -> validarHorario(scanner)
            8 -> validarBrigada(scanner)
            9 -> {
                validarCurso(scanner)
                validarEstudiante(scanner)
                validarUsuario(scanner)
                validarFundacion(scanner)
                validarCertificado(scanner)
                validarEdicion(scanner)
                validarHorario(scanner)
                validarBrigada(scanner)
                validarComando(scanner)
                validarCalificacion(scanner)
                validarAsistencia(scanner)
                validarColegio(scanner)
                validarUnidad(scanner)
            }
            10 -> validarComando(scanner)
            11 -> validarCalificacion(scanner)
            12 -> validarAsistencia(scanner)
            13 -> validarColegio(scanner)
            14 -> validarUnidad(scanner)
            0 -> {
                println("Saliendo del programa...")
                salir = true
            }
            else -> println("Opción no válida. Por favor, intenta de nuevo.")
        }
    }
}

// ----------------------------------------------------------------------------------------------------
// Validación de Curso
fun validarCurso(scanner: Scanner) {
    println("\n=== Validación de Curso ===")
    print("Introduce el nombre del curso: ")
    val nombreCurso = scanner.nextLine()

    print("Introduce la descripción del curso: ")
    val descripcionCurso = scanner.nextLine()

    print("Introduce la intensidad horaria del curso (ejemplo: '40 horas'): ")
    val intensidadHorariaCurso = scanner.nextLine()

    print("¿El curso está activo? (true/false): ")
    val estadoCurso = scanner.nextBoolean()
    scanner.nextLine()

    val esCursoValido = CursoValidator.validarCurso(
        nombre = nombreCurso,
        descripcion = descripcionCurso,
        intensidadHoraria = intensidadHorariaCurso,
        estado = estadoCurso
    )

    println(if (esCursoValido) "El curso es válido." else "El curso es inválido.")
}

// ----------------------------------------------------------------------------------------------------
// Validación de Estudiante
fun validarEstudiante(scanner: Scanner) {
    println("\n=== Validación de Estudiante ===")
    print("Introduce el nombre del estudiante: ")
    val nombreEstudiante = scanner.nextLine()

    print("Introduce el apellido del estudiante: ")
    val apellidoEstudiante = scanner.nextLine()

    print("Introduce el correo del estudiante: ")
    val correoEstudiante = scanner.nextLine()

    print("Introduce el número de documento del estudiante: ")
    val documentoEstudiante = scanner.nextLine()

    print("¿El estudiante está activo? (true/false): ")
    val estadoEstudiante = scanner.nextBoolean()
    scanner.nextLine()

    val esEstudianteValido = false
    println(if (esEstudianteValido) "El estudiante es válido." else "El estudiante es inválido.")
}

// ----------------------------------------------------------------------------------------------------
// Validación de Usuario
fun validarUsuario(scanner: Scanner) {
    println("\n=== Validación de Usuario ===")
    print("Introduce el nombre del usuario: ")
    val nombreUsuario = scanner.nextLine()

    print("Introduce el apellido del usuario: ")
    val apellidoUsuario = scanner.nextLine()

    print("Introduce el correo del usuario: ")
    val correoUsuario = scanner.nextLine()

    print("Introduce los roles del usuario (separados por comas, ejemplo: 'Admin,Instructor'): ")
    val rolesUsuario = scanner.nextLine().split(",").map { it.trim() }

    print("¿El usuario está activo? (true/false): ")
    val estadoUsuario = scanner.nextBoolean()
    scanner.nextLine()

    val esUsuarioValido = UsuarioValidator.validarUsuario(
        nombre = nombreUsuario,
        apellido = apellidoUsuario,
        correo = correoUsuario,
        estado = estadoUsuario,
        roles = rolesUsuario
    )

    println(if (esUsuarioValido) "El usuario es válido." else "El usuario es inválido.")
}

// ----------------------------------------------------------------------------------------------------
// Validación de Fundación
fun validarFundacion(scanner: Scanner) {
    println("\n=== Validación de Fundación ===")
    print("Introduce el nombre de la fundación: ")
    val nombreFundacion = scanner.nextLine()

    print("¿La fundación está activa? (true/false): ")
    val estadoFundacion = scanner.nextBoolean()
    scanner.nextLine()

    val esFundacionValida = FundacionValidator.validarFundacion(
        nombre = nombreFundacion,
        estado = estadoFundacion
    )

    println(if (esFundacionValida) "La fundación es válida." else "La fundación es inválida.")
}

// ----------------------------------------------------------------------------------------------------
// Validación de Certificado
fun validarCertificado(scanner: Scanner) {
    println("\n=== Validación de Certificado ===")
    print("Introduce la fecha de emisión del certificado (yyyy-MM-dd): ")
    val fechaEmisionCertificado = scanner.nextLine()

    print("Introduce el nombre del emisor del certificado: ")
    val nombreEmisorCertificado = scanner.nextLine()

    print("Introduce el código de verificación del certificado: ")
    val codigoCertificado = scanner.nextLine()

    val esCertificadoValido = CertificadoValidator.validarCertificado(
        fechaEmision = fechaEmisionCertificado,
        nombreEmisor = nombreEmisorCertificado,
        codigoVerificacion = codigoCertificado
    )

    println(if (esCertificadoValido) "El certificado es válido." else "El certificado es inválido.")
}

// ----------------------------------------------------------------------------------------------------
// Validación de edicion
/* Inclusión por rest de insights cs anteriores directo */
fun validarEdicion(scanner: Scanner) {
    println("\n=== Validación de Edición ===")
    print("Introduce el título de la edición: ")
    val tituloEdicion = scanner.nextLine()

    print("Introduce la fecha de inicio de la edición (yyyy-MM-dd): ")
    val fechaInicioEdicion = scanner.nextLine()

    print("Introduce la fecha de fin de la edición (yyyy-MM-dd): ")
    val fechaFinEdicion = scanner.nextLine()

    print("¿La edición está activa? (true/false): ")
    val estadoEdicion = scanner.nextBoolean()
    scanner.nextLine()

    val esEdicionValida = EdicionValidator.validarEdicion(
        titulo = tituloEdicion,
        fechaInicio = fechaInicioEdicion,
        fechaFin = fechaFinEdicion,
        estado = estadoEdicion,
        edicion = TODO()
    )

    println(if (esEdicionValida) "La edición es válida." else "La edición es inválida.")
}

// ----------------------------------------------------------------------------------------------------
// Validación de Horario
fun validarHorario(scanner: Scanner) {
    println("\n=== Validación de Horario ===")
    print("Introduce el título del horario: ")
    val tituloHorario = scanner.nextLine()

    print("Introduce la hora de inicio (formato HH:mm, ejemplo: 08:00): ")
    val horaInicioHorario = scanner.nextLine()

    print("Introduce la hora de fin (formato HH:mm, ejemplo: 10:00): ")
    val horaFinHorario = scanner.nextLine()

    print("¿El horario está activo? (true/false): ")
    val estadoHorario = scanner.nextBoolean()
    scanner.nextLine()

    val esHorarioValido = HorarioValidator.validarHorario(
        titulo = tituloHorario,
        horaInicio = horaInicioHorario,
        horaFin = horaFinHorario,
        estado = estadoHorario
    )

    println(if (esHorarioValido) "El horario es válido." else "El horario es inválido.")
}

// ----------------------------------------------------------------------------------------------------
// Validación de Brigada
fun validarBrigada(scanner: Scanner) {
    println("\n=== Validación de Brigada ===")
    print("Introduce el nombre de la brigada: ")
    val nombreBrigada = scanner.nextLine()

    print("Introduce la ubicación de la brigada: ")
    val ubicacionBrigada = scanner.nextLine()

    print("¿La brigada está activa? (true/false): ")
    val estadoBrigada = scanner.nextBoolean()
    scanner.nextLine()

    val esBrigadaValida = BrigadaValidator.validarBrigada(
        nombre = nombreBrigada,
        ubicacion = ubicacionBrigada,
        estado = estadoBrigada
    )

    println(if (esBrigadaValida) "La brigada es válida." else "La brigada es inválida.")
}

// ----------------------------------------------------------------------------------------------------
// Validación de Comando
fun validarComando(scanner: Scanner) {
    println("\n=== Validación de Comando ===")
    print("Introduce el nombre del comando: ")
    val nombreComando = scanner.nextLine()

    print("Introduce la ubicación del comando: ")
    val ubicacionComando = scanner.nextLine()

    print("Introduce el ID de la fundación del comando: ")
    val fundacionId = scanner.nextLine()

    print("Introduce las brigadas asociadas (separadas por comas, ejemplo: Brigada1, Brigada2): ")
    val brigadas = scanner.nextLine().split(",").map { it.trim() }

    print("¿El comando está activo? (true/false): ")
    val estadoComando = scanner.nextBoolean()
    scanner.nextLine()

    val esComandoValido = ComandoValidator.validarComando(
        nombreComando,
        estadoComando,
        ubicacionComando,
        fundacionId,
        brigadas
    )

    println(if (esComandoValido) "El comando es válido." else "El comando es inválido.")
}

// ----------------------------------------------------------------------------------------------------
// Validación de Calificación
fun validarCalificacion(scanner: Scanner) {
    println("\n=== Validación de Calificación ===")
    print("Introduce el título de la calificación: ")
    val tituloCalificacion = scanner.nextLine()

    print("¿La calificación está aprobada? (true/false): ")
    val aprobado = scanner.nextBoolean()
    scanner.nextLine()

    print("¿La calificación está activa? (true/false): ")
    val estadoCalificacion = scanner.nextBoolean()
    scanner.nextLine()

    print("Introduce los estudiantes relacionados (separados por comas, ejemplo: EstudianteA, EstudianteB): ")
    val estudiantes = scanner.nextLine().split(",").map { it.trim() }

    val esCalificacionValida = CalificacionValidator.validarCalificacion(
        tituloCalificacion,
        aprobado,
        estadoCalificacion,
        estudiantes
    )

    println(if (esCalificacionValida) "La calificación es válida." else "La calificación es inválida.")
}

// ----------------------------------------------------------------------------------------------------
// Validación de Asistencia
fun validarAsistencia(scanner: Scanner) {
    println("\n=== Validación de Asistencia ===")
    print("Introduce el nombre del registro de asistencia: ")
    val tituloAsistencia = scanner.nextLine()

    print("Introduce la fecha de la asistencia (formato YYYY-MM-DD): ")
    val fechaAsistencia = scanner.nextLine()

    print("¿La asistencia está activa? (true/false): ")
    val estadoAsistencia = scanner.nextBoolean()
    scanner.nextLine()

    print("Introduce los estudiantes asociados (separados por comas): ")
    val estudiantes = scanner.nextLine().split(",").map { it.trim() }

    val esAsistenciaValida = AsistenciaValidator.validarAsistencia(
        tituloAsistencia, fechaAsistencia, estadoAsistencia, estudiantes
    )

    println(if (esAsistenciaValida) "La asistencia es válida." else "La asistencia es inválida.")
}

// ----------------------------------------------------------------------------------------------------
// Validación de Colegio
fun validarColegio(scanner: Scanner) {
    println("\n=== Validación de Colegio ===")
    print("Introduce el nombre del colegio: ")
    val nombreColegio = scanner.nextLine()

    print("Introduce el email del colegio: ")
    val emailColegio = scanner.nextLine()

    print("¿El colegio está activo? (true/false): ")
    val estadoColegio = scanner.nextBoolean()
    scanner.nextLine()

    print("Introduce los estudiantes asociados al colegio (separados por comas): ")
    val estudiantes = scanner.nextLine().split(",").map { it.trim() }

    val esColegioValido = ColegioValidator.validarColegio(
        nombreColegio,
        emailColegio,
        estadoColegio,
        estudiantes
    )

    println(if (esColegioValido) "El colegio es válido." else "El colegio es inválido.")
}

// ----------------------------------------------------------------------------------------------------
// Validación de Unidad
fun validarUnidad(scanner: Scanner) {
    println("\n=== Validación de Unidad ===")

    // Pedir el nombre de la unidad y validar que no esté vacío
    print("Introduce el nombre de la unidad: ")
    var nombreUnidad = scanner.nextLine()
    while (nombreUnidad.isBlank()) {
        println("Error: El nombre de la unidad no puede estar vacío. Inténtalo de nuevo.")
        nombreUnidad = scanner.nextLine()
    }

    // Pedir si la unidad está activa
    print("¿La unidad está activa? (true/false): ")
    while (!scanner.hasNextBoolean()) {
        println("Error: Debes ingresar 'true' o 'false'. Inténtalo de nuevo.")
        scanner.nextLine()
    }
    val estadoUnidad = scanner.nextBoolean()
    scanner.nextLine() // Consumir salto de línea restante

    // Pedir el ID de la brigada asociada y validar que no esté vacío
    print("Introduce el ID de la brigada asociada: ")
    var brigadaId = scanner.nextLine()
    while (brigadaId.isBlank()) {
        println("Error: El ID de la brigada no puede estar vacío. Inténtalo de nuevo.")
        brigadaId = scanner.nextLine()
    }

    // Pedir el ID del usuario asociado y validar que no esté vacío
    print("Introduce el ID del usuario asociado: ")
    var usuarioId = scanner.nextLine()
    while (usuarioId.isBlank()) {
        println("Error: El ID del usuario no puede estar vacío. Inténtalo de nuevo.")
        usuarioId = scanner.nextLine()
    }

    // Pedir y validar la lista de estudiantes
    print("Introduce los estudiantes asociados a la unidad (separados por comas): ")
    val estudiantesInput = scanner.nextLine()
    val estudiantes = estudiantesInput.split(",").map { it.trim() }.filter { it.isNotBlank() }

    if (estudiantes.isEmpty()) {
        println("Error: Debes ingresar al menos un estudiante válido.")
        return
    }

    // Validar la unidad usando el validador
    val esUnidadValida = UnidadValidator.validarUnidad(
        nombreUnidad, estadoUnidad, brigadaId, usuarioId, estudiantes
    )

    // Mostrar el resultado
    println(if (esUnidadValida) "La unidad es válida." else "La unidad es inválida.")
}
