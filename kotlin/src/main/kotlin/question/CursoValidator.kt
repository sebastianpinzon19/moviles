package question.question

class CursoValidator {

        fun validarNombreCurso(nombre: String){
            if (nombre == "pedrito") {
                println("nombre del curso valido")
            } else {
                println("El nombre del curso no puede ser 'pedrito'")
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