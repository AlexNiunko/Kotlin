fun main() {
//    val a = 30
//    val b = 20
//
//    val max = if (a > b) a else b
//    println(max)
//
//    val number = -10 + 10
//
//    val message = if (number > 0) {
//        "Positive"
//    } else if (number < 0) {
//        "Negative"
//    } else {
//        "Zero"
//    }
//
//    println(message)
//
//    val x = 1
//    when (x) {
//        1 -> println("One")
//        2 -> println("Two")
//        3 -> println("Three")
//        else -> println("Unknown number")
//    }
//
//    val description: String = when (number) {
//        1 -> "One"
//        2 -> "two"
//        3 -> "three"
//        0 -> "zero"
//        else -> "Unknown"
//    }
//
//    println(description)
//
//    when {
//        5 < 10 -> println("Fuck you")
//        0 < 1 -> println("Greate!!!!")
//    }
//
    var obj: Any = 100

    when(obj){
        is String -> println("It is String")
        is Int -> println("It is Int ${obj}")
        else -> println("I don't know")
    }





}