package question

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
        println("0. Salir")
        print("Elige una opción: ")

        val opcion = scanner.nextInt()
        scanner.nextLine() // Consumir el salto de línea

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
            }
            0 -> {
                println("Saliendo del programa...")
                salir = true
            }
            else -> println("Opción no válida. Por favor, intenta de nuevo.")
        }
    }
}

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
    scanner.nextLine() // Consumir la línea restante

    val esCursoValido = CursoValidator.validarCurso(
        nombre = nombreCurso,
        descripcion = descripcionCurso,
        intensidadHoraria = intensidadHorariaCurso,
        estado = estadoCurso
    )

    if (esCursoValido) println("El curso es válido.") else println("El curso es inválido.")
}

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
    scanner.nextLine() // Consumir la línea restante

    val esEstudianteValido = EstudianteValidator.validarEstudiante(
        nombre = nombreEstudiante,
        apellido = apellidoEstudiante,
        correo = correoEstudiante,
        numeroDocumento = documentoEstudiante,
        estado = estadoEstudiante
    )

    if (esEstudianteValido) println("El estudiante es válido.") else println("El estudiante es inválido.")
}

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
    scanner.nextLine() // Consumir la línea restante

    val esUsuarioValido = UsuarioValidator.validarUsuario(
        nombre = nombreUsuario,
        apellido = apellidoUsuario,
        correo = correoUsuario,
        estado = estadoUsuario,
        roles = rolesUsuario
    )

    if (esUsuarioValido) println("El usuario es válido.") else println("El usuario es inválido.")
}

fun validarFundacion(scanner: Scanner) {
    println("\n=== Validación de Fundación ===")
    print("Introduce el nombre de la fundación: ")
    val nombreFundacion = scanner.nextLine()

    print("¿La fundación está activa? (true/false): ")
    val estadoFundacion = scanner.nextBoolean()
    scanner.nextLine() // Consumir la línea restante

    val esFundacionValida = FundacionValidator.validarFundacion(
        nombre = nombreFundacion,
        estado = estadoFundacion
    )

    if (esFundacionValida) println("La fundación es válida.") else println("La fundación es inválida.")
}

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

    if (esCertificadoValido) println("El certificado es válido.") else println("El certificado es inválido.")
}

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
    scanner.nextLine() // Consumir la línea restante

    val esEdicionValida = EdicionValidator.validarEdicion(
        titulo = tituloEdicion,
        fechaInicio = fechaInicioEdicion,
        fechaFin = fechaFinEdicion,
        estado = estadoEdicion
    )

    if (esEdicionValida) println("La edición es válida.") else println("La edición es inválida.")
}

fun validarHorario(scanner: Scanner) {
    println("\n=== Validación de Horario ===")
    print("Introduce el título del horario: ")
    val tituloHorario = scanner.nextLine()

    print("Introduce la hora de inicio (HH:mm): ")
    val horaInicioHorario = scanner.nextLine()

    print("Introduce la hora de fin (HH:mm): ")
    val horaFinHorario = scanner.nextLine()

    print("¿El horario está activo? (true/false): ")
    val estadoHorario = scanner.nextBoolean()
    scanner.nextLine() // Consumir la línea restante

    val esHorarioValido = HorarioValidator.validarHorario(
        titulo = tituloHorario,
        horaInicio = horaInicioHorario,
        horaFin = horaFinHorario,
        estado = estadoHorario
    )

    if (esHorarioValido) println("El horario es válido.") else println("El horario es inválido.")
}

fun validarBrigada(scanner: Scanner) {
    println("\n=== Validación de Brigada ===")
    print("Introduce el nombre de la brigada: ")
    val nombreBrigada = scanner.nextLine()

    print("Introduce la ubicación de la brigada: ")
    val ubicacionBrigada = scanner.nextLine()

    print("¿La brigada está activa? (true/false): ")
    val estadoBrigada = scanner.nextBoolean()
    scanner.nextLine() // Consumir la línea restante

    val esBrigadaValida = BrigadaValidator.validarBrigada(
        nombre = nombreBrigada,
        ubicacion = ubicacionBrigada,
        estado = estadoBrigada
    )

    if (esBrigadaValida) println("La brigada es válida.") else println("La brigada es inválida.")
}