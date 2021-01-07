package br.com.teste.bytebank.exceptions

class SaldoInsulficienteException(mensagem: String = "O saldo é insulficiente") : Exception(mensagem) {
}