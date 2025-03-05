package question.question.vehiculo

fun elegirvehiculo() {
    while (true) {
        println("\n¿Qué vehículo desea usar?")
        println("1. Coche")
        println("2. Bicicleta")
        println("3. Salir")

        when (readLine()?.toIntOrNull()) {
            1 -> ejecutarVehiculo()
            2 -> ejecutarBicicleta()
            3 -> break
            else -> println("Opción no válida")
        }
    }
}