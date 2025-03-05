package question.question.vehiculoseb

// Clase Motocicleta
class Motocicleta(
    marca: String,
    modelo: String,
    año: Int,
    val tieneSidecar: Boolean
) : Vehiculo(marca, modelo, año) {

    override fun realizarMantenimiento() {
        println("Realizando mantenimiento de la motocicleta $marca $modelo: Ajuste de cadena, revisión de frenos y neumáticos.")
        println("Reparando el vehículo...")
        setMarchaActual(0)
        setEstaRoto(false)
    }

    override fun mostrarEspecificaciones() {
        println("Especificaciones de la motocicleta $marca $modelo: ${if (tieneSidecar) "Con sidecar" else "Sin sidecar"}, año $año.")
    }

    fun hacerCaballito() {
        if (velocidadActual > 20) {
            println("$marca $modelo está Picando la moto a $velocidadActual km/h.")
        } else {
            println("$marca $modelo necesita más velocidad para hacer un caballito.")
        }
    }
}