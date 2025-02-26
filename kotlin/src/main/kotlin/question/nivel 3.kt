package question


import question.question.clases.numerosmultiplicacion3


fun ejecutarNivel3() {
    println("============nivel 3====================")


    //#1
    print("Ingrese un número: ")
    val numeros = readLine()?.toIntOrNull()
    if (numeros != null) {
        if (numeros > 10) {
            println("Mayor que 10")
        } else {
            println("Menor o igual a 10")
        }
    } else {
        println("Por favor, ingrese un número válido.")
    }



    //#2
    print("Ingrese un número: ")
    val numerom = readLine()?.toIntOrNull()
    when {
        numerom == null -> println("Por favor, ingrese un número válido.")
        numerom > 0 -> println("El número es positivo.")
        numerom < 0 -> println("El número es negativo.")
        else -> println("El número es cero.")
    }



    //3
    val estudiante = Estudiante(nombre = "Juan", edad = 20)

    // Puedes acceder a sus propiedades directamente si lo necesitas
    println("Nombre del estudiante: ${estudiante.nombre}")
    println("Edad del estudiante: ${estudiante.edad}")



    //#4
    val result = numerosmultiplicacion3().multiplicacion(5, 3)
    println("El producto de los números es: $result")


     //#5
    println("Ingrese un número decimal: ")
    val numeroDecimal = readLine()?.toFloatOrNull()
    if (numeroDecimal != null) {
        val numeroEntero = numeroDecimal.toInt()
        println("El número convertido a entero es: $numeroEntero")
    } else {
        println("Por favor, ingrese un número decimal válido.")
    }


}