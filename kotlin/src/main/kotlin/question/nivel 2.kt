package question

fun ejecutarNivel2() {
    println("============nivel 2====================")
//
//    //#1
//    print("Por favor, ingresa un número entero: ")
//
//    val numero = readLine()?.toIntOrNull()
//
//    if (numero != null) {
//        if (numero % 2 == 0) {
//            println("El número $numero es par.")
//        } else {
//            println("El número $numero es impar.")
//        }
//    } else {
//        println("Por favor, ingrese un número válido.")
//    }
//    //#2
//    val double = 10.5
//    val float = 5.5
//    val sumResult = double + float
//    println("La suma entre Double y Float es: $sumResult")
//
//    //3
//    val productoPrecio = 100000 // Precio del producto en pesos colombianos
//    val porcentajeDescuento = 15// Porcentaje de descuento (por ejemplo, 15%)
//    val preciofinal = productoPrecio - (productoPrecio * porcentajeDescuento / 100)
//
//    println("El precio final del producto en pesos colombianos es: $preciofinal")
//
    //4
    // Solicita tres números al usuario, calcúlalos y muestra el promedio.
    print("Ingrese el primer número: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Ingrese el segundo número: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Ingrese el tercer número: ")
    val num3 = readLine()?.toDoubleOrNull() ?: 0.0

    val promedio = (num1 + num2 + num3) / 3
    println("El promedio de los tres números es: $promedio")


    println("Fin del nivel 2")
}