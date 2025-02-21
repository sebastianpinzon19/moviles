package question.question

class CursoValidator {

        fun validarNombreCurso(nombre: String){
            if (nombre == "servicio social") {
                println("nombre del curso valido")
            } else {
                println("El nombre del curso no pede estar vacio")
            }
        }

        fun validarEstadoCurso(estado: Boolean){
        if (estado) {
            println("El curso esta activo")
        } else {
            println("El curso está inactivo")
        }
    }
}