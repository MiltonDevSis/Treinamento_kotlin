package br.com.teste.bytebank.arrays

fun testaIncrementaSalarios() {
    val salarios: DoubleArray = doubleArrayOf(1000.0, 2000.0, 3000.0, 4000.0, 5000.0)

    val aumento = 1.1

//    var i = 0

//    for (salario in salarios){
//
//        salarios[i] = salario * aumento
//        i++
//       println(salarios[i-1])
//    }

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println(salarios.contentToString())
}