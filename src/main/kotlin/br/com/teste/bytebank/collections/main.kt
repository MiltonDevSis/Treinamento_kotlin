package br.com.teste.bytebank.collections

fun main() {

    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()

//    val minhaFuncaoLambda: () -> Unit = {
//        println("Executa como lambda")
//    }
//    println(minhaFuncaoLambda())
//
//    val minhaFuncaoAnonima: () -> Unit = fun() {
//        println("Executa como anonima")
//    }
//    println(minhaFuncaoAnonima())

}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(5, 15))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao : (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int) : Int {
    return a + b
}

class Soma: (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b

}