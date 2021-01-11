package br.com.teste.bytebank.funcional

fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int {
        println("Executa como anonima")
        return a + b
    }
    println(minhaFuncaoAnonima(8, 8))

    val cauculaBonificacaoAnonimo: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100
    }
    println(cauculaBonificacaoAnonimo(1000.0))
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b -> a + b }// func. lambda retorna a ultima expressao a direita
    //val minhaFuncaoLambda = { a; Int, b: Int -> a + b }
    println(minhaFuncaoLambda(15, 10))

    //(exemplo 01)
    val cauculaBonificacao1: (Double) -> Double = {
        if (it > 1000.0) {
            it + 50
        }
        it + 100
    }
    println(cauculaBonificacao1(1000.0))

    // (exemplo 02)  dar nome ao it(no caso salario, expressao(label) @lambda para ter multiplos retornos e especificar o parameto)
    val cauculaBonificacao2: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        salario + 100
    }
    println(cauculaBonificacao2(1100.0))
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