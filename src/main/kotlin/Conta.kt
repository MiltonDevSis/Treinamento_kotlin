open class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
    private set

    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    open fun sacar(valor: Double) {

        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transferir(valor: Double, contaDestino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.depositar(valor)
            return true
        }
        return false
    }
}