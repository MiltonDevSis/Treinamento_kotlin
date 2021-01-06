fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Milton",
        numero = 101
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Maria",
        numero = 102
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo CC: ${contaCorrente.saldo}")
    println("Saldo CP: ${contaPoupanca.saldo}")

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
}