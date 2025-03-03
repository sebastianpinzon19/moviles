import question.Estudiante

fun arreglos() {
    // Crear una matriz vacía de estudiantes (2 filas y 3 columnas inicialmente)
    val matrizEstudiantes = Array(2) { Array(3) { Estudiante("", 0, 0.0, false) } }

    // Función para imprimir la matriz de estudiantes
    fun imprimirMatriz() {
        for (fila in matrizEstudiantes) {
            fila.forEach { println(it) }
            println()  // Salto de línea para separar las filas
        }
    }

    // Función para certificar a un estudiante
    fun certificarEstudiante(estudiante: Estudiante): String {
        return if (estudiante.calificacion >= 7.0 && estudiante.asistencia) {
            "Estudiante ${estudiante.nombre} certificado con éxito."
        } else {
            "Estudiante ${estudiante.nombre} no cumple con los requisitos para ser certificado."
        }
    }

    // Obtener la entrada del usuario para llenar la matriz de estudiantes
    for (i in matrizEstudiantes.indices) {
        for (j in matrizEstudiantes[i].indices) {
            println("Ingrese los datos del estudiante para la fila ${i + 1}, columna ${j + 1}:")
            println("Nombre del estudiante:")
            val nombre = readLine() ?: ""

            println("Edad del estudiante:")
            val edad = readLine()?.toIntOrNull() ?: 0

            println("Calificación del estudiante:")
            val calificacion = readLine()?.toDoubleOrNull() ?: 0.0

            println("¿Tiene asistencia completa? (true/false):")
            val asistencia = readLine()?.toBoolean() ?: false

            // Asignar el estudiante a la matriz
            matrizEstudiantes[i][j] = Estudiante(nombre, edad, calificacion, asistencia)
        }
    }

    // Imprimir la matriz de estudiantes después de la entrada del usuario
    println("\nMatriz de estudiantes ingresada:")
    imprimirMatriz()

    // Modificar la calificación de un estudiante
    println("¿Desea modificar la calificación de algún estudiante? (si/no)")
    if (readLine()?.toLowerCase() == "si") {
        println("Ingrese las coordenadas del estudiante a modificar (fila, columna):")
        val filaModificar = readLine()?.toIntOrNull() ?: 0
        val columnaModificar = readLine()?.toIntOrNull() ?: 0

        println("Ingrese la nueva calificación:")
        val nuevaCalificacion = readLine()?.toDoubleOrNull() ?: 0.0

        // Verificar que las coordenadas sean válidas
        if (filaModificar in 1..2 && columnaModificar in 1..3) {
            matrizEstudiantes[filaModificar - 1][columnaModificar - 1].calificacion = nuevaCalificacion
            println("La calificación de ${matrizEstudiantes[filaModificar - 1][columnaModificar - 1].nombre} ha sido modificada a $nuevaCalificacion")
        } else {
            println("Las coordenadas son inválidas.")
        }
    }

    // Imprimir la matriz después de la modificación
    println("\nMatriz después de la modificación:")
    imprimirMatriz()

    // Certificar un estudiante
    val estudianteCertificado = matrizEstudiantes[0][1] // Ejemplo: certificar al estudiante de la fila 1, columna 2
    println("\nResultado de la certificación de ${estudianteCertificado.nombre}:")
    println(certificarEstudiante(estudianteCertificado))
}
