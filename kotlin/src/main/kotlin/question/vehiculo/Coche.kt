package question.question.vehiculo
import question.vehiculo.Vehiculo

class Coche(marca: String, modelo: String, val tipo: String) : Vehiculo(marca, modelo) {
    private var encendido: Boolean = false
    private var combustible: Int = 100
    private var distanciaRecorrida: Double = 0.0
    private var cambioActual: Int = 0

    override fun arrancar() {
        if (combustible > 0) {
            encendido = true
            println("El coche $marca modelo $modelo tipo $tipo ha arrancado")
        } else {
            println("No hay suficiente combustible para arrancar")
        }
    }

    fun ajustarCambio(cambio: Int) {
        if (!encendido) {
            println("Primero debe arrancar el coche")
            return
        }
        if (combustible > 0) {
            if (cambio in 1..5 && (cambio == cambioActual + 1 || cambio == cambioActual - 1)) {
                cambioActual = cambio
                val nuevaVelocidad = when (cambioActual) {
                    1 -> 20
                    2 -> 40
                    3 -> 60
                    4 -> 80
                    5 -> 100
                    else -> {
                        println("Cambio no válido")
                        return
                    }
                }
                ajustarVelocidad(nuevaVelocidad)
                consumirCombustible()
                println("El coche está ahora en el cambio $cambioActual a $nuevaVelocidad km/h")
            } else {
                println("Cambio no permitido. Debe subir o bajar una marcha a la vez.")
                detener()
                println("El coche se ha apagado por un cambio incorrecto.")
            }
        } else {
            detener()
            println("Sin combustible - El coche se ha detenido")
        }
    }

    private fun consumirCombustible() {
        combustible -= (velocidadActual / 20)
        distanciaRecorrida += velocidadActual / 3.6 // convierte km/h a m/s
    }

    fun repostarCombustible() {
        combustible = 100
        println("Tanque lleno (100%)")
    }

    fun mostrarEstado() {
        println("\nEstado del vehículo:")
        println("Combustible: $combustible%")
        println("Velocidad actual: $velocidadActual km/h")
        println("Distancia recorrida: ${String.format("%.2f", distanciaRecorrida / 1000)} km")
        println("Cambio actual: $cambioActual")
    }

    override fun detener() {
        super.detener()
        encendido = false
    }
}