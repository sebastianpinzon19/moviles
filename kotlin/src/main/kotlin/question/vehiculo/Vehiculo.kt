package question.vehiculo

abstract class Vehiculo( protected val marca: String,protected val modelo: String) {
    var velocidadActual: Int = 0
        private set

    abstract fun arrancar()

    open fun detener() { velocidadActual = 0
        println("El vehiculo $marca modelo $modelo se ha detenido")
    }

    internal fun ajustarVelocidad(velocidad: Int) {
        velocidadActual = velocidad
        println("El coche $marca modelo $modelo está ahora a $velocidadActual km/h")
    }

    internal fun getMarca(): String {
        return marca
    }
}