package question.question

class EstudianteValidador {

    fun validarNombreEstudiante(nombreestu: String) {
        if (nombreestu == "andres") {
            println("el nombre el valido")
        } else {
            println("el nombre no es valido")
        }

    }

    fun validarestadoestudiante(estadoestu: Boolean) {
        if (estadoestu) {
            println("el estudiante esta activo")
        } else {
            println("el estudiante esta inactivo")
        }

    }
}