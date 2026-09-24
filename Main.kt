const val name: String = "Alexandr"


fun main(args: Array<String>) {

    collection()
    second()

    println("Hi jackass, my name is $name")

    var age: Double = 10.10


    var b = 37

    println("Мне ${b * 10 / 25} лет" + " fuck!!!!")
}

fun second() {
    var pair = Pair("Kotlin", 1)
    println(pair.toString())


}


fun collection() {
    var map: MutableMap<String, Int> = mutableMapOf("Alex" to 37, "Michail" to 11)

    println(map)
    val imutableMap: Map<String, Int> = mapOf("Natasha" to 42, "Dasha" to 5)

    map["Anatoliy"] = 67
    println(map)


}