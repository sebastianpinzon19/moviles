package question.question.vehiculoseb

// Clase Coche
class Coche(
    marca: String,
    modelo: String,
    año: Int,
    val numeroPuertas: Int
) : Vehiculo(marca, modelo, año) {

    override fun realizarMantenimiento() {
        println("Realizando mantenimiento del coche $marca $modelo: Cambio de aceite, revisión de frenos y neumáticos.")
        println("Reparando el vehículo...")
        setMarchaActual(0)
        setEstaRoto(false)
    }

    override fun mostrarEspecificaciones() {
        println("Especificaciones del coche $marca $modelo: $numeroPuertas puertas, año $año.")
    }

    fun abrirPuertas() {
        println("$marca $modelo tiene $numeroPuertas puertas abiertas.")
    }
}