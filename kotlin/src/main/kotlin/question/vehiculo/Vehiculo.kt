package question.vehiculo

abstract class Vehiculo(val marca: String, val modelo: String) {
    var velocidadActual: Int = 0
        private set

    abstract fun arrancar()

    fun detener() { velocidadActual = 0
        println("El vehiculo $marca modelo $modelo se ha detenido")
    }

    fun ajustarVelocidad(velocidad: Int) {
        velocidadActual = velocidad
        println("El coche $marca modelo $modelo está ahora a $velocidadActual km/h")
    }

}