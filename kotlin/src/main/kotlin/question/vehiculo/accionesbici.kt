package question.question.vehiculo

fun ejecutarBicicleta() {
    val bicicleta = Bicicleta("Trek", "X-Caliber", "Montaña")
    val bicicleta2 = Bicicleta("Specialized", "Stumpjumper", "Montaña")
    val bicicleta3 = Bicicleta("Giant", "Defy", "Carretera")
    val bicicleta4 = Bicicleta("Cannondale", "Synapse", "Carretera")
    bicicleta.arrancar()


    while (true){
        println("\nElija una opción:")
        println("1. Trek")
        println("2. Specialized")
        println("3. Giant")
        println("4. Cannondale")
        println("5. Salir")

        when (readLine()?.toIntOrNull()) {
            1 -> bicicleta2.arrancar()
            2 -> bicicleta3.arrancar()
            3 -> bicicleta4.arrancar()
            4 -> bicicleta4.arrancar()
            5 -> break
            else -> println("Opción no válida")
        }
    while (true) {
        println("\nElija una opción:")
        println("1. Velocidad 10 km/h")
        println("2. Velocidad 20 km/h")
        println("3. Velocidad 30 km/h")
        println("4. Realizar salto")
        println("5. Detener bicicleta")
        println("6. Salir")

        when (readLine()?.toIntOrNull()) {
            1 -> bicicleta.ajustarVelocidad(10)
            2 -> bicicleta.ajustarVelocidad(20)
            3 -> bicicleta.ajustarVelocidad(30)
            4 -> bicicleta.saltar()
            5 -> bicicleta.detener()
            6 -> break
            else -> println("Opción no válida")
        }


    }

}
}