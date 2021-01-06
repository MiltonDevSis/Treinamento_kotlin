class CauculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun regitra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao()
    }
}