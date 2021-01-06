abstract class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
    protected set

    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun sacar(valor: Double)

    fun transferir(valor: Double, contaDestino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.depositar(valor)
            return true
        }
        return false
    }
}