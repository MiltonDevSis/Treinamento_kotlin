fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("positivo")
    } else if (saldo == 0.0) {
        println("neutro")
    } else {
        println("negativo")
    }

    when {
        saldo > 0.0 -> println("positivo")
        saldo == 0.0 -> println("neutro")
        else -> println("negativo")
    }
}