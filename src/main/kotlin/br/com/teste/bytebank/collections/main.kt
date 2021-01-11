package br.com.teste.bytebank.collections

fun main() {

    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())

    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())

}
fun teste() {
    println("Executa teste")
}

class Teste: () -> Unit{
    override fun invoke() {
        println("Executa invoke")
    }
}