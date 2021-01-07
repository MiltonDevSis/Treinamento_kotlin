package br.com.teste.bytebank.arrays

fun CriandoArray() {
    /*
    val idades = IntArray(4)

    idades[0] = 10
    idades[1] = 8
    idades[2] = 18
    idades[3] = 50
    */
    val idades: IntArray = intArrayOf(10, 8, 18, 50, 55)

    var maiorIdade = Int.MIN_VALUE

    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println("Maior idade é: $maiorIdade anos")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println("Menor idade é: $menorIdade anos")
}