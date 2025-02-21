package question

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var salir = false

    while (!salir) {
        println("\n=== Menú de Validaciones ===")
        println("1. Validar Curso")
        println("2. Validar Estudiante")
        println("3. Ejecutar todas las validaciones")
        println("0. Salir")
        print("Elige una opción: ")

        val opcion = scanner.nextInt()
        scanner.nextLine() // Consumir el salto de línea sobrante

        when (opcion) {
            1 -> validarCurso(scanner)
            2 -> validarEstudiante(scanner)
            3 -> {
                validarCurso(scanner)
                validarEstudiante(scanner)
            }
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

    print("¿El curso está activo? (true/false): ")
    val estadoCurso = scanner.nextBoolean()
    scanner.nextLine()

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

