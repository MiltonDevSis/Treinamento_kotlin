import br.com.teste.bytebank.exceptions.FalhaAutenticacaoException
import br.com.teste.bytebank.exceptions.SaldoInsulficienteException
import br.com.teste.bytebank.model.Cliente
import br.com.teste.bytebank.model.ContaCorrente
import br.com.teste.bytebank.model.ContaPoupanca
import java.lang.Exception

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val maria = Cliente(nome = "Maria", cpf = "", senha = 2)

    var contaAlex = ContaCorrente(titular = alex, numero = 100)
    contaAlex.depositar(100.0)

    var contaMaria = ContaPoupanca(numero = 101, titular = maria)
    contaMaria.depositar(100.0)

    println("Despositando")
    contaAlex.depositar(0.0)
    contaMaria.depositar(1000.0)

    println(contaAlex.saldo)
    println(contaMaria.saldo)

    println("Sacando")
    contaAlex.sacar(50.0)
    println(contaAlex.saldo)

    contaMaria.sacar(550.0)
    println(contaMaria.saldo)

    println("Transferindo")
    try {
        contaMaria.transferir(500.0, contaAlex, 2)
        println("Sucesso")
    } catch (e: SaldoInsulficienteException) {
        println("Falha")
        println("Saldo insulficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferência")
        println("Falha na autenticação")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println(contaAlex.saldo)
    println(contaMaria.saldo)
}