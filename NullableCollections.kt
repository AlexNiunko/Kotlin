fun main(){
    val list: List<Int>? =null

    list?.let {
        println("This collection is null")
    }

    val list1: List<String?> = listOf("one","two","three",null,"five")

    println(list1)




}