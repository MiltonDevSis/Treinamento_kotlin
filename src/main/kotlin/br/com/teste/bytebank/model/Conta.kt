package br.com.teste.bytebank.model

import br.com.teste.bytebank.exceptions.FalhaAutenticacaoException
import br.com.teste.bytebank.exceptions.SaldoInsulficienteException

var totalContas = 0
    private set

abstract class Conta(
    var titular: Cliente,
    val numero: Int
): Autenticavel {
    var saldo = 0.0
        protected set

    init {
        println("Contas criandas")
        totalContas++
    }

    override fun autenticar(senha: Int): Boolean {
        return titular.autenticar(senha)
    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun sacar(valor: Double)

    fun transferir(valor: Double, contaDestino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsulficienteException(mensagem = "O saldo é insulficiente, saldo atual: $saldo, valor a ser subtraido $valor")
        }
        if (!autenticar(senha)){
            throw FalhaAutenticacaoException()
        }
        saldo -= valor
        contaDestino.depositar(valor)
    }
}