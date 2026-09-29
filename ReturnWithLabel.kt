fun main() {

//    println("new list: ${lambdaWithoutLabel()}")
    println("new list: ${lambdaWithLabel()}")
}

fun lambdaWithoutLabel(): List<Int>{
    val numbers= listOf(1,2,3,4)
    return numbers.map {
        println(it)
        if (it == 3) return listOf(1,1,1,1,1)
        it*2
    }
}

fun lambdaWithLabel(): List<Int>{

    val numbers= listOf(1,2,3,4,5)
    return numbers.map label@ {
        println(it)
        if (it%2==0) return@label 10000
        it
    }
}