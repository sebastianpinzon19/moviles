package question.question.clases

class numerosmultiplicacion3 {

    fun multiplicacion(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun division(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun leerNumero(mensaje: String): Int {
        println(mensaje)
        return readLine()!!.toInt()
    }

    fun EligeLaOpcionDeOperacion() {
        println("Ingrese la opcion para su operacion 1 (Multiplicar) o 2 (Dividir)")
        when (readLine()?.toIntOrNull()) {
            1 -> {
                val num1 = leerNumero("Ingrese el primer numero")
                val num2 = leerNumero("Ingrese el segundo numero")
                println("El resultado de la operacion es ${multiplicacion(num1, num2)}")
            }

            2 -> {
                val num1 = leerNumero("Ingrese el primer numero")
                val num2 = leerNumero("Ingrese el segundo numero")
                println("El resultado de la operacion es ${division(num1, num2)}")
            }

            else -> println("Ingrese una opcion valida.")
        }
    }
}
