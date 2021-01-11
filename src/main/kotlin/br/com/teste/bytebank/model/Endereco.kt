package br.com.teste.bytebank.model

class Endereco(
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = ""
){
    override fun toString(): String {
        return "Endereco(logradouro='$logradouro', " +
                "\nnumero=$numero, " +
                "\nbairro='$bairro', " +
                "\ncidade='$cidade', " +
                "\nestado='$estado', " +
                "\ncep='$cep', " +
                "\ncomplemento='$complemento')"
    }
}