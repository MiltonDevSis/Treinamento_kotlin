import br.com.teste.bytebank.model.Cliente
import br.com.teste.bytebank.model.ContaCorrente
import br.com.teste.bytebank.model.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val maria = Cliente(nome = "Maria", cpf = "", senha = 2)

    var contaAlex = ContaCorrente(titular = alex, numero = 100)
    contaAlex.depositar(1000.0)

    var contaMaria = ContaPoupanca(numero = 101, titular = maria)
    contaMaria.depositar(2000.0)

    println("Despositando")
    contaAlex.depositar(250.0)
    contaMaria.depositar(100.0)

    println(contaAlex.saldo)
    println(contaMaria.saldo)

    println("Sacando")
    contaAlex.sacar(50.0)
    println(contaAlex.saldo)

    contaMaria.sacar(550.0)
    println(contaMaria.saldo)

    println("Transferindo")
    if (contaMaria.transferir(500.0, contaAlex)) {
        println("Sucesso")
    } else {
        println("Falha")
    }

    println(contaAlex.saldo)
    println(contaMaria.saldo)
}