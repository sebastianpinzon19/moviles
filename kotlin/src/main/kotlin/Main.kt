package question

//import question.question.CursoValidator
//import question.tu.paquete.estudiante.EstudianteProcessor


fun main() {
    // ejecutarNivel1()
    // ejecutarNivel2()


    println("============nivel 3====================")
//
//    print("Ingrese un número: ")
//    val numero = readLine()?.toIntOrNull()
//    if (numero != null) {
//        if (numero > 10) {
//            println("Mayor que 10")
//        } else {
//            println("Menor o igual a 10")
//        }
//    } else {
//        println("Por favor, ingrese un número válido.")
//    }

    print("Ingrese un número: ")
    val numero = readLine()?.toIntOrNull()
    when {
        numero == null -> println("Por favor, ingrese un número válido.")
        numero > 0 -> println("El número es positivo.")
        numero < 0 -> println("El número es negativo.")
        else -> println("El número es cero.")
    }



}



