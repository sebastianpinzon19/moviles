package question.question.vehiculoseb

// Clase Camion
class Camion(
    marca: String,
    modelo: String,
    año: Int,
    val capacidadCarga: Double
) : Vehiculo(marca, modelo, año) {

    override fun realizarMantenimiento() {
        println("Realizando mantenimiento del camión $marca $modelo: Revisión de motor, frenos y sistema de carga.")
        println("Reparando el vehículo...")
        setMarchaActual(0)
        setEstaRoto(false)
    }

    override fun mostrarEspecificaciones() {
        println("Especificaciones del camión $marca $modelo: Capacidad de carga $capacidadCarga kg, año $año., con el peso de carga$")
    }

    fun cargar(peso: Double) {
        if (peso <= capacidadCarga) {
            println("$marca $modelo cargado con $peso kg.")
        } else {
            println("$marca $modelo no puede cargar $peso kg, excede la capacidad máxima de $capacidadCarga kg.")
        }
    }
}