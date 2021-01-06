package br.com.teste.bytebank.model

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int
) : Autenticavel {

    override fun autenticar(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}