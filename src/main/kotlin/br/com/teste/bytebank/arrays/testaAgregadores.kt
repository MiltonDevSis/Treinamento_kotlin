package br.com.teste.bytebank.arrays

fun testaAgregadores() {
    val idades = intArrayOf(10, 15, 27, 12, 35, 14, 32, 1, 56)
    val maiorIdade = idades.maxOrNull()
    println("A maior idade é: $maiorIdade")


    val menorIdade = idades.minOrNull()
    println("A menor idade é: $menorIdade")

    val media = idades.average()
    println("A media de idade é: $media")

    // all (retorna true se todos satisfazem a condição)
    val maioresDe = idades.all { it >= 18 }
    println("Os maiores são: $maioresDe")

    // any (retorna true se pelo menos 1 satisfaz a condição)
    val existeMaior = idades.any { it >= 18 }
    println("Existe algum maior de idade: $existeMaior")

    // (retorna uma lista quando satisfaz a condição)
    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    // (retorna o primeiro valor que satizfaz a condição) (obs: da lista)
    val busca = idades.find { it >= 18 }
    println("Busca: $busca")
}
