package br.com.teste.bytebank.model

interface Autenticavel {

    fun autenticar(senha: Int) : Boolean
}