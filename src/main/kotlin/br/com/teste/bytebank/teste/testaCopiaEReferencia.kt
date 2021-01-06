import br.com.teste.bytebank.model.Cliente
import br.com.teste.bytebank.model.ContaCorrente
import br.com.teste.bytebank.model.ContaPoupanca

fun testaCopiaEReferencia() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val maria = Cliente(nome = "Maria", cpf = "", senha = 1)
    val ana = Cliente(nome = "Ana", cpf = "", senha = 2)

    //val conta = ContaCorrente(maria, 1000)

    var contaA = ContaPoupanca(ana, 2000)
    var contaB = contaA


    println("ContaA: ${contaA.titular}")
    println("ContaB: ${contaB.titular}")

}