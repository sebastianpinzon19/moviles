package estudiante.kt

import estudiante.kt.Models.administrador.Fundacion

fun main() {
    val estudiante: Estudiante = Estudiante()
    val Fundacion : Fundacion = Fundacion()



    println(Fundacion.nombreFundacion + " " + Fundacion.estadoFundacion)
    println(estudiante.nombre + " " + estudiante.apellido)

}
