fun main() {


    println("Length ${lengthOfName("Alex")}")

    println("ohhhhohohoho ${showDefaultParam()}")

    println(manyParamsWithDefaultValues("Hi", null))

    println(slave(10))
}

fun greet(name: String): String {
    return "Hello ${name} , are you faggot??? Peace of shit!!! You smell as a fucking pig"
}

fun lengthOfName(name: String): Int {
    return name.length
}

fun showDefaultParam(param: Int = 1): String {

    var result: String = ""
    for (i in 0..10) {
        result += i.toString()
    }
    return result
}

fun manyParamsWithDefaultValues(first: String, second: String?, third: String = "Fuck you"): String {
    return first + second + third;

}

fun anyString(param: String): Int = param.length

fun slave(number: Int = 10): String? {
    var res: String=""

    for (i in 0..10) {
        res = res+i.toString()
    }
    return res

}