package br.com.teste.bytebank.list

fun main() {

    val livro1 = Livro(
        titulo = "Grande sertões veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "O codigo da vince",
        autor = "Dan Brown",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "Jose de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> =  mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1850
        )
    )

    livros.imprimeLivros()

    livros.remove(livro2)

    livros.imprimeLivros()

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeLivros()

    val ordenaAutor = livros.sortedBy { it.autor }
    ordenaAutor.imprimeLivros()

    livros.sortedBy { it.titulo }.imprimeLivros()

    livros
        .filter { it.autor == "João Guimarães Rosa" } // { it.autor.starsWith("j") } tras somente nomes que começam com J
        .sortedBy { it.anoPublicacao }
        .imprimeLivros()

}

fun List<Livro>.imprimeLivros() {
   val imprime = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("### lista de livros #### \n $imprime")
}