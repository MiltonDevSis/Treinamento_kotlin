fun testaCopiaEReferencia() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val conta = ContaCorrente("Maria", 1000)

    var contaA = ContaPoupanca("Ana", 2000)
    var contaB = contaA


    println("ContaA: ${contaA.titular}")
    println("ContaB: ${contaB.titular}")

}