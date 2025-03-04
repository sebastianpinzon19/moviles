package question.question.vehiculo
import question.vehiculo.Vehiculo

class Coche(marca: String, modelo: String, val tipo: String) : Vehiculo(marca, modelo) {
    private var encendido: Boolean = false
    private var combustible: Int = 100
    private var distanciaRecorrida: Double = 0.0

    override fun arrancar() {
        if (combustible > 0) {
            encendido = true
            println("El coche $marca modelo $modelo tipo $tipo ha arrancado")
        } else {
            println("No hay suficiente combustible para arrancar")
        }
    }

    fun acelerar(incremento: Int) {
        if (!encendido) {
            println("Primero debe arrancar el coche")
            return
        }
        if (combustible > 0) {
            val nuevaVelocidad = minOf(velocidadActual + incremento, 120)
            ajustarVelocidad(nuevaVelocidad)
            consumirCombustible()
        } else {
            detener()
            println("Sin combustible - El coche se ha detenido")
        }
    }

    fun frenar(decremento: Int) {
        if (encendido) {
            val nuevaVelocidad = maxOf(velocidadActual - decremento, 0)
            ajustarVelocidad(nuevaVelocidad)
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
    }

    override fun detener() {
        super.detener()
        encendido = false
    }
}