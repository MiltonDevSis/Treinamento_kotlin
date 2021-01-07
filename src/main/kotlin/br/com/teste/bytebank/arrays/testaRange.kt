package br.com.teste.bytebank.arrays

fun testeRange() {
    val serie: IntRange = 1.rangeTo(10)
    for (x in serie) {
        print(x)
    }
    println()
    println()
    val numerosPares = 0..30 step 2
    for (numeroPar in numerosPares) {
        print(numeroPar)
    }
    println()
    println()
    val numerosPares2 = 0.until(30) step 2
    for (numeroPar in numerosPares2) {
        print(numeroPar)
    }
    println()
    println()
    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print(it) }
    println()
    println()
    val intervalo = 1000.0..5000.0
    val salario = 5500.0
    if (salario in intervalo) {
        println("OK")
    } else {
        print("NOT")
    }
    println()
    println()
    val alfabeto = 'a'..'m'
    val letra = 'n'
    println(letra in alfabeto)
}