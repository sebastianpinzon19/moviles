package question.question.vehiculo

import question.vehiculo.Vehiculo

class Coche(marca: String, modelo: String, val tipo: String) : Vehiculo(marca, modelo) {
    override fun arrancar() {
        println("El coche $marca modelo $modelo y tipo $tipo ha arrancado")
    }
}