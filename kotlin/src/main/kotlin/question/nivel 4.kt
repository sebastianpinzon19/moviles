package question.question

import question.question.clases.Perro4
import question.question.clases.cuentaBancaria
import question.question.clases.getter

fun ejecutarNivel4() {

        println("============nivel 4====================")


        //#1
        val numeros = arrayOf(1, 2, 3, 4, 5)
        for (numero in numeros) {
                println(numero)
        }

        //#2
        val cuenta = cuentaBancaria()

        println("Bienvenido ${cuenta.titular}")
        println("Saldo inicial: ${cuenta.saldo} COP")

        cuenta.depositar(30_000.0)
        println("Saldo después del depósito: ${cuenta.saldo} COP")

        cuenta.retirar(20_000.0)
        println("Saldo después del retiro: ${cuenta.saldo} COP")

        cuenta.retirar(400_000.0)

        //#3
        val nombresmut = mutableListOf("Carlos", "Ana", "Pedro")
        nombresmut.addAll(listOf("María", "Juan", "Luis", "sebastian"))
        println("Lista actualizada: $nombresmut")

        print("Ingrese 3 nombres separados por comas: ")
        val nombres = readLine()
                ?.split(",")
                ?.toMutableList()
                ?: mutableListOf()
        nombres.addAll(listOf("María", "Juan", "Luis", "sebastian"))
        println("Lista actualizada: $nombres")

        println("quieres agregar otros nombres? si/no")
        val otroNombre = readLine()
        if (otroNombre == "si") {
                print("Ingrese 3 nombres separados por comas: ")
                val otrosNombres = readLine()
                        ?.split(",")
                        ?.toMutableList()
                        ?: mutableListOf()
                nombres.addAll(otrosNombres)
                println("Lista actualizada: $nombres")
        }else {
                println("Fin del programa")
        }





        //#4
        val getterInstance = getter()
        println("Valor inicial: ${getterInstance.value}")

        getterInstance.value = 10
        println("Nuevo valor asignado positivo: ${getterInstance.value}")

        getterInstance.value = -5
        println("Intento de asignar valor negativo: ${getterInstance.value}")

        //#5
        val perro = Perro4()
        perro.hacerSonido()

        println("===============Fin del nivel 4================")
}

