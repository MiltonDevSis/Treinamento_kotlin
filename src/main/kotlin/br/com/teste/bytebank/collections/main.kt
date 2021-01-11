package br.com.teste.bytebank.collections

fun main() {

//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()

    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b -> a + b }// func. lambda retorna a ultima expressao a direita
    //val minhaFuncaoLambda = { a; Int, b: Int -> a + b }
    println(minhaFuncaoLambda(15, 10))

    val minhaFuncaoAnonima: (Int , Int) -> Int = fun(a, b) : Int {
        println("Executa como anonima")
        return a + b
    }
    println(minhaFuncaoAnonima(8, 8))

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