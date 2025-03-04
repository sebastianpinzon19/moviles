package question.question.vehiculo

fun ejecutarVehiculo() {
    val coche = Coche("BMW", "M3", "Deportivo")
    val coche2 = Coche("Audi", "A4", "Sedán")
    val coche3 = Coche("Toyota", "Camry", "Híbrido")
    val coche4 = Coche("Ford", "F-150", "Pickup")

    var cocheActual = coche

    while (true) {
        println("\n¿Qué coche desea usar?")
        println("1. BMW")
        println("2. Audi")
        println("3. Toyota")
        println("4. Ford")
        println("5. Salir")

        when (readLine()?.toIntOrNull()) {
            1 -> cocheActual = coche
            2 -> cocheActual = coche2
            3 -> cocheActual = coche3
            4 -> cocheActual = coche4
            5 -> return
            else -> {
                println("Opción no válida")
                continue
            }
        }

        cocheActual.arrancar()

        while (true) {
            println("\nElija una opción:")
            println("1. Velocidad 20 km/h")
            println("2. Velocidad 40 km/h")
            println("3. Velocidad 60 km/h")
            println("4. Detener vehículo")
            println("5. Cambiar de coche")

            when (readLine()?.toIntOrNull()) {
                1 -> cocheActual.ajustarVelocidad(20)
                2 -> cocheActual.ajustarVelocidad(40)
                3 -> cocheActual.ajustarVelocidad(60)
                4 -> cocheActual.detener()
                5 -> break
                else -> println("Opción no válida")
            }
        }
    }
}