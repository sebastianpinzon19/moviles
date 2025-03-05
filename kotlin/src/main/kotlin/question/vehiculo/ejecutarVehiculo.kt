package question.question.vehiculo

fun ejecutarVehiculo() {
    val coche = Coche("BMW", "M3", "Deportivo")
    val coche2 = Coche("Audi", "A4", "Sedán")
    val coche3 = Coche("Toyota", "Camry", "Híbrido")
    val coche4 = Coche("Ford", "F-150", "Pickup")

    var cocheActual = coche

    while (true) {
        println("\n¿Qué coche desea usar?")
        println("1. BMW M3 (Deportivo)")
        println("2. Audi A4 (Sedán)")
        println("3. Toyota Camry (Híbrido)")
        println("4. Ford F-150 (Pickup)")
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

        while (true) {
            println("\nMenú de control:")
            println("1. Arrancar coche")
            println("2. Ajustar cambio")
            println("3. Repostar combustible")
            println("4. Ver estado")
            println("5. Detener coche")
            println("6. Cambiar de coche")

            when (readLine()?.toIntOrNull()) {
                1 -> cocheActual.arrancar()
                2 -> {
                    println("Seleccione el cambio (1, 2, 3, 4, 5):")
                    readLine()?.toIntOrNull()?.let { cocheActual.ajustarCambio(it) }
                }
                3 -> cocheActual.repostarCombustible()
                4 -> cocheActual.mostrarEstado()
                5 -> cocheActual.detener()
                6 -> break
                else -> println("Opción no válida")
            }
        }
    }
}