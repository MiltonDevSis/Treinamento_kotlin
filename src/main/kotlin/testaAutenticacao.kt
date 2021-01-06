fun testaAutenticacao() {
    val gerente = Gerente(
        "Alex",
        "111.111.111-04",
        1000.0,
        100
    )

    val diretor = Diretor(
        "Maria",
        "222.222.222-04",
        2000.0,
        200,
        200.0
    )

    val cliente = Cliente(
        nome = "Teste",
        cpf = "222.222.222-06",
        senha = 123
    )

    val sistema = SistemaInterno()
    sistema.entrar(gerente, 100)
    sistema.entrar(diretor, 200)
    sistema.entrar(cliente, 123)
}
