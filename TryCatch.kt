import java.lang.Exception

fun main() {
    println(divide(5, 0))

}

fun divide(x: Int, y: Int): String {
    return try {
        (x / y).toString()

    } catch (e: Exception) {
        println("Деление на ноль, прекрати безумец!!!!")
        100.toString()
    }
}