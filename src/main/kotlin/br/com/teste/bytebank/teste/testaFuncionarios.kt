import br.com.teste.bytebank.model.Analista
import br.com.teste.bytebank.model.CauculadoraBonificacao
import br.com.teste.bytebank.model.Diretor
import br.com.teste.bytebank.model.Gerente

fun testaFuncionarios() {
    val maria = Analista(
        nome = "Maria",
        cpf = "123.123.123-04",
        salario = 1000.0
    )

    val alex = Gerente(
        senha = 123,
        nome = "Alex",
        cpf = "222.222.222-04",
        salario = 2000.0
    )

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-04",
        salario = 4000.0,
        senha = 321,
        plr = 200.0
    )

    val tiago = Analista(
        "Tiago",
        "444.444.444-05",
        3000.0
    )

    println("Nome: ${maria.nome}")
    println("Cpf: ${maria.cpf}")
    println("Salario: ${maria.salario}")

    println("Bonificação: ${maria.bonificacao}")
    println()
    println("Nome: ${alex.nome}")
    println("Cpf: ${alex.cpf}")
    println("Salario: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao}")

    if (alex.autenticar(123)) {
        println("Sucesso")
    } else {
        println("Falhou")
    }
    println()
    println("Nome: ${gui.nome}")
    println("Cpf: ${gui.cpf}")
    println("Salario: ${gui.salario}")
    println("PLR: ${gui.plr}")
    println("Bonificação: ${gui.bonificacao}")

    if (gui.autenticar(321)) {
        println("Sucesso")
    } else {
        println("Falhou")
    }

    val cauculadora = CauculadoraBonificacao()
    cauculadora.regitra(alex)
    cauculadora.regitra(maria)
    cauculadora.regitra(gui)
    cauculadora.regitra(tiago)

    println("Total de bonificação: ${cauculadora.total}")
}