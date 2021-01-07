package br.com.teste.bytebank.teste

import br.com.teste.bytebank.model.*

fun testaObjects() {
    val alex = Cliente(nome = "alex", cpf = "000.000", senha = 1)
    val contaCorrente = ContaCorrente(alex, 100)
    val contaPoupanca = ContaCorrente(alex, 101)

    println("Total de contas criadas $totalContas")

    // object expression

    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 123

        override fun autenticar(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entrar(fran, 123)

    println("Nome do cliente ${fran.nome}")
}
