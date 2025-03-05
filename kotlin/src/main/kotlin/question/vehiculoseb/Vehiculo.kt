package question.question.vehiculoseb

// Clase abstracta Vehiculo
abstract class Vehiculo(
    val marca: String,
    val modelo: String,
    val año: Int
) : Conducible {
    var velocidadActual: Double = 0.0
    private var marchaActual: Int = 0 // 0 = punto muerto
    private val velocidadMaximaPorMarcha = listOf(0.0, 30.0, 60.0, 90.0, 120.0, 150.0) // Velocidades máximas por marcha
    private var estaRoto: Boolean = false


    abstract fun realizarMantenimiento()
    abstract fun mostrarEspecificaciones()


    fun setEstaRoto(estado: Boolean) {
        estaRoto = estado
    }

    fun setMarchaActual(marcha: Int) {
        if (marcha in 0 until velocidadMaximaPorMarcha.size) {
            marchaActual = marcha
        } else {
            println("Marcha inválida.")
        }
    }


    fun acelerar(velocidad: Double) {
        if (estaRoto) {
            println("¡$marca $modelo está roto y no puede acelerar! Deten el vehiculo y realiza el mantenimiento.")
            return
        }
        if (marchaActual == 0) {
            println("$marca $modelo no puede acelerar en punto muerto. Cambia a una marcha.")
            return
        }
        velocidadActual += velocidad
        verificarVelocidad()
        println("$marca $modelo acelerando a $velocidadActual km/h en la marcha $marchaActual.")
    }

    fun frenar(velocidad: Double) {
        if (estaRoto) {
            println("¡$marca $modelo está roto y no puede frenar!")
            return
        }
        velocidadActual -= velocidad
        if (velocidadActual < 0) velocidadActual = 0.0
        verificarVelocidad()
        println("$marca $modelo frenando a $velocidadActual km/h en la marcha $marchaActual.")
    }

    fun subirMarcha() {
        if (estaRoto) {
            println("¡$marca $modelo está roto y no puede cambiar de marcha!")
            return
        }
        if (marchaActual < velocidadMaximaPorMarcha.size - 1) {
            if (marchaActual == 0) {
                marchaActual = 1 // Solo se puede arrancar en primera marcha
            } else if (marchaActual + 1 > velocidadMaximaPorMarcha.size - 1) {
                println("$marca $modelo ya está en la marcha más alta.")
                return
            } else {
                marchaActual++
            }
            println("$marca $modelo ha subido a la marcha $marchaActual.")
            println("Velocidad máxima permitida para la marcha $marchaActual: ${velocidadMaximaPorMarcha[marchaActual]} km/h.")
            verificarVelocidad()
        } else {
            println("$marca $modelo ya está en la marcha más alta.")
        }
    }

    fun bajarMarcha() {
        if (estaRoto) {
            println("¡$marca $modelo está roto y no puede cambiar de marcha!")
            return
        }
        if (marchaActual > 0) {
            marchaActual--
            println("$marca $modelo ha bajado a la marcha $marchaActual.")
            println("Velocidad máxima permitida para la marcha $marchaActual: ${velocidadMaximaPorMarcha[marchaActual]} km/h.")
            verificarVelocidad()
        } else {
            println("$marca $modelo ya está en punto muerto.")
        }
    }

    fun cambiarMarcha(marchaDeseada: Int) {
        println("Cambia a un marcha 1, 2, 3, 4, ")
        if (estaRoto) {
            println("¡$marca $modelo está roto y no puede cambiar de marcha!")
            return
        }
        if (marchaDeseada < 0 || marchaDeseada >= velocidadMaximaPorMarcha.size) {
            println("Marcha inválida.")
            return
        }
        if (marchaDeseada == marchaActual) {
            println("$marca $modelo ya está en la marcha $marchaDeseada.")
            return
        }
        if (marchaDeseada > marchaActual + 1 || marchaDeseada < marchaActual - 1) {
            println("¡Error! No puedes saltarte marchas. jajaja Novato")
            return
        }
        marchaActual = marchaDeseada
        println("$marca $modelo ha cambiado a la marcha $marchaActual.")
        println("Velocidad máxima permitida para la marcha $marchaActual: ${velocidadMaximaPorMarcha[marchaActual]} km/h.")
        verificarVelocidad()
    }

    private fun verificarVelocidad() {
        val velocidadMaxima = velocidadMaximaPorMarcha[marchaActual]
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima
            println("$marca $modelo ha alcanzado la velocidad máxima permitida para la marcha $marchaActual: $velocidadMaxima km/h.")
        }
    }

    override fun arrancar() {
        if (marchaActual != 0 && marchaActual != 1) {
            estaRoto = true
            println("¡Error! $marca $modelo intentó arrancar en la marcha $marchaActual. El vehículo se Rompio:((.")
            return
        }
        if (marchaActual == 0) {
            marchaActual = 1 // Cambia a primera marcha al arrancar
        }
        println("$marca $modelo ha arrancado en la marcha $marchaActual.")
    }

    override fun detener() {
        velocidadActual = 0.0
        marchaActual = 0
        println("$marca $modelo se ha detenido y está en punto muerto.")
    }

    fun obtenerInformacion(): String {
        return "Marca: $marca, Modelo: $modelo, Año: $año, Velocidad Actual: $velocidadActual km/h, Marcha Actual: $marchaActual, ¿Está roto? $estaRoto"
    }
}