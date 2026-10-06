package practice

import java.util.Collections
import java.util.TreeSet

fun main() {
    val sentence = "Kotlin is a modern programming language"

    printSortedWords(sentence)

}


fun printSortedWords(sentence:String){
    val stringList = sentence.split(" ")
    val size = stringList.size
    println("Size of sentence is $size words")
    val sorted = stringList.sorted()
    for (s in sorted) {

    }

}