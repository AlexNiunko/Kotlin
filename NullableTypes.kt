fun main() {
    val b:String = "Hello"
    var a: String? = null

    val c = a?.length?:100

    println(c)

    val length = a?.length?:100

    println(length)

    var age: Int? = 37

    age?.let {
        println("My age is ${age}")
    }




}