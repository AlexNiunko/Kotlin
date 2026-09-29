fun main() {

    println(second(arrayOf("A", "B", "C", "D")))
    val fruits = mutableListOf("Apple", "Peanut", "Banana")

    for (fruit in fruits) {
        if (fruit == "Apple") {
            println("I have found a fruit !!!! It is $fruit")
        }
    }
    for (i in 0..5) {
        println(i / 2)
    }


    for (i in 10 downTo 0 step 5) {
        println("Fuck you bastard $i")
    }
}

fun second(args: Array<String>) {
    var length = args.size
    val start = args.size
    while (length > 0) {
        println(args[start-length])
        length--
    }
}