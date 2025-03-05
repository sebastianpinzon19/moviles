package question.question.vehiculoseb
import kotlin.system.exitProcess

fun menuDeControl(){
val coche = Coche("CocheDeBatman", "Renolt", 2020, 4)
val moto = Motocicleta("NS200", "Pulsar", 2019, false)
val camion = Camion("Chiva", "Renolt", 2018, 20000.0)

println("Bienvenido al simulador de vehículos.")
println("Selecciona un vehículo:")
println("1. Coche")
println("2. Motocicleta")
println("3. Camión")
print("Opción: ")
val opcionVehiculo = readLine()?.toIntOrNull()

var vehiculo = when (opcionVehiculo) {
    1 -> coche
    2 -> moto
    3 -> camion
    else -> {
        println("Opción inválida. Saliendo del programa.")
        exitProcess(0)
    }
}




    while (true) {
        println("\nAcciones disponibles:")
        println("1. Arrancar")
        println("2. Detener")
        println("3. Acelerar")
        println("4. Frenar")
        println("5. Subir marcha")
        println("6. Bajar marcha")
        println("7. Cambiar marcha")
        println("8. Mostrar información")
        println("9. Realizar mantenimiento")
        println("10. Mostrar especificaciones")
        println("14. Cambiar Vehiculo")
        if (vehiculo is Coche) println("11. Abrir puertas")
        if (vehiculo is Motocicleta) println("12. Hacer caballito")
        if (vehiculo is Camion) println("13. Cargar")
        println("0. Salir")
        print("Opción: ")
        val opcion = readLine()?.toIntOrNull()

        when (opcion) {
            1 -> vehiculo.arrancar()
            2 -> vehiculo.detener()
            3 -> {
                print("Introduce la velocidad a acelerar: ")
                val velocidad = readLine()?.toDoubleOrNull() ?: 0.0
                vehiculo.acelerar(velocidad)
            }

            4 -> {
                print("Introduce la velocidad a frenar: ")
                val velocidad = readLine()?.toDoubleOrNull() ?: 0.0
                vehiculo.frenar(velocidad)
            }

            5 -> vehiculo.subirMarcha()
            6 -> vehiculo.bajarMarcha()
            7 -> {
                print("Introduce la marcha deseada: ")
                val marcha = readLine()?.toIntOrNull() ?: 0
                vehiculo.cambiarMarcha(marcha)
            }

            8 -> println(vehiculo.obtenerInformacion())
            9 -> vehiculo.realizarMantenimiento()
            10 -> vehiculo.mostrarEspecificaciones()
            11 -> if (vehiculo is Coche) vehiculo.abrirPuertas()
            12 -> if (vehiculo is Motocicleta) vehiculo.hacerCaballito()
            13 -> if (vehiculo is Camion) {
                print("Introduce el peso a cargar: ")
                val peso = readLine()?.toDoubleOrNull() ?: 0.0
                vehiculo.cargar(peso)
            }
            14 -> {
                println("Selecciona un vehículo:")
                println("1. Coche")
                println("2. Motocicleta")
                println("3. Camión")
                print("Opción: ")
                val opcionVehiculo = readLine()?.toIntOrNull()

                vehiculo = when (opcionVehiculo) {

                    1 -> coche
                    2 -> moto
                    3 -> camion
                    else -> {
                        println("Opción inválida.")
                        continue
                    }
                }
            }
            0 -> {
                println("Saliendo del programa.")
                break
            }

            else -> println("Opción inválida.")
        }
    }
}