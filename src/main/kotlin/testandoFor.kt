fun testandoFor() {

    for (i in 10 downTo 1 step 2) {
        println(i)

        if (i == 4) {
            break
        }
    }
}