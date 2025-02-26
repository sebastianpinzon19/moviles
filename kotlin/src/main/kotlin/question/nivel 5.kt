package question.question

data class Libro(val titulo: String, val autor: String, val anioPublicacion: Int)

fun ejecutarNivel5() {
    println("============nivel 5====================")

    // #21: Uso de Set
    val numerosSet = mutableSetOf(1, 2, 3, 4)
    println("Contenido del Set inicial: $numerosSet")
    numerosSet.add(5)
    numerosSet.add(3) // Intento de agregar un valor duplicado
    println("Contenido del Set tras intentar agregar un duplicado: $numerosSet")

    // #22: Colecciones complejas
    data class Estudiante(val nombre: String, val edad: Int, val promedio: Double)

    val estudiantes = listOf(
        Estudiante("Juan", 20, 8.5),
        Estudiante("Ana", 22, 6.8),
        Estudiante("Pedro", 19, 9.0),
        Estudiante("Luisa", 21, 7.5)
    )
    val estudiantesConBuenPromedio = estudiantes.filter { it.promedio > 7.0 }
    println("Estudiantes con promedio mayor a 7: $estudiantesConBuenPromedio")

    // #23: Función de orden superior
    fun ejecutarFuncion(funcion: () -> Unit) {
        println("Ejecutando la función pasada como parámetro:")
        funcion()
    }
    ejecutarFuncion { println("Soy una función lambda ejecutándose dentro de otra función.") }

    // #24: Uso de data class
    val libroEjemplo = Libro("1984", "George Orwell", 1949)
    println("Detalles del libro: Título - ${libroEjemplo.titulo}, Autor - ${libroEjemplo.autor}, Año - ${libroEjemplo.anioPublicacion}")

    println("===================Fin del nivel 5=====================")
}

