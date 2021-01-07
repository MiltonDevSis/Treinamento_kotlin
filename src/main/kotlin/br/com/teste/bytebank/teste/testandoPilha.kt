package br.com.teste.bytebank.teste

import br.com.teste.bytebank.exceptions.SaldoInsulficienteException
import java.lang.ClassCastException

fun funcao1(){
    println("inicio Função 1")
    try {
        funcao2()
    }catch (e: ClassCastException){
        e.printStackTrace()
        println("Erro: ClassCastException")
    }
    println("Fim Função 1")
}

fun funcao2(){
    println("inicio Função 2")
    for (i in 1..5){
        println(i)
        val endereco = Any()
        throw SaldoInsulficienteException()
    }
    println("Fim Função 2")
}