package question.question.vehiculo
import question.vehiculo.Vehiculo

class Bicicleta(marca: String, modelo: String, val tipo: String) : Vehiculo(marca, modelo) {
    override fun arrancar() {
        println("La bicicleta $marca modelo $modelo y tipo $tipo ha arrancado")
    }

    fun saltar() {
        println("La bicicleta $marca modelo $modelo ha realizado un salto")
    }
}