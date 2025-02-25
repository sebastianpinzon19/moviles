package question.question.clases

class getter {
    private var valor: Int = 3

    var value: Int
        get() = valor
        set(newValue) {
            valor = if (newValue >= 0) newValue else -2
        }
}