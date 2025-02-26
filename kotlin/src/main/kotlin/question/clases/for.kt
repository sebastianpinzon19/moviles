package question.question.clases

class `for` {

    fun checkArray(array: Array<Int>) {
        for ((index, num) in array.withIndex()) {
            if (num > 10) {
                println("Unidad $index: $num es mayor que 10")
            } else {
                println("Unidad $index: $num no es mayor que 10")
            }
        }
    }
}