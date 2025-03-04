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
                    println("2. Acelerar")
                    println("3. Frenar")
                    println("4. Repostar combustible")
                    println("5. Ver estado")
                    println("6. Detener coche")
                    println("7. Cambiar de coche")

                    when (readLine()?.toIntOrNull()) {
                        1 -> cocheActual.arrancar()
                        2 -> {
                            println("Incremento de velocidad (10-30 km/h):")
                            readLine()?.toIntOrNull()?.let { cocheActual.acelerar(it) }
                        }
                        3 -> {
                            println("Decremento de velocidad (10-30 km/h):")
                            readLine()?.toIntOrNull()?.let { cocheActual.frenar(it) }
                        }
                        4 -> cocheActual.repostarCombustible()
                        5 -> cocheActual.mostrarEstado()
                        6 -> cocheActual.detener()
                        7 -> break
                        else -> println("Opción no válida")
                    }
                }
            }
        }