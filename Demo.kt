val numbers: Array<Int> = arrayOf(1, 2, 3)

fun main() {

    var x = 4.14
    var y: Int = x.toInt()

    println("X is $x , and y is $y")


    println(numbers.contentToString())

    println(1.0.compareTo(1.0))

    val doubled = 21.times(2) // doubled является объектом класса Int
    println(doubled) // Output: 42

    val d = 8.times(2)

    println(d)


    val name = "Alex"
    val age = 37

    val text: String = """
        Hi everybody, my name is 
        $name and i'm 
        $age years old
    """.trimIndent()

    println(text)
}