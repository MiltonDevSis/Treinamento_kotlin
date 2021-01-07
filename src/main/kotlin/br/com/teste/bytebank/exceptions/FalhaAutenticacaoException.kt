package br.com.teste.bytebank.exceptions

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticação"
): Exception(mensagem) {
}