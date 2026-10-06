fun main() {
    val a = 5
    val b = 10

    runCatching {
        a / b
    }.onSuccess { println("все нормально ") }
        .onFailure { println("Все плохо") }



}