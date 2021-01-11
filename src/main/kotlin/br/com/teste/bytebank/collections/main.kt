package br.com.teste.bytebank.collections

import br.com.teste.bytebank.model.Endereco

fun main() {

//    val endereco = Endereco(logradouro = "Rua das flores", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    val endereEmMaiusculo = Endereco(logradouro = "Rua das flores", numero = 3185)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println)

    listOf(
        Endereco(complemento = "Casa"),
        Endereco(),
        Endereco(complemento = "Apt")
    )
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(::println)
}

