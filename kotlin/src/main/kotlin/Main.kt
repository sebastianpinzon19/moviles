package question

import question.question.CursoValidator
import question.tu.paquete.estudiante.EstudianteProcessor


fun main() {

    println("Introduce el nombre del curso: ")
    val nombre:String = readLine().toString()

    val cursoValidator = CursoValidator()
    cursoValidator.validarNombreCurso(nombre)

    println("introduce el estado del curso:")

    val estadoCurso: Boolean = readLine()?.toBoolean() ?: false


    cursoValidator.validarEstadoCurso(estadoCurso)


    val processor = EstudianteProcessor.EstudianteProcessor()
    processor.procesar()


}

