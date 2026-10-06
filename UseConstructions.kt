import java.io.File

fun main() {
    val file = File("text.txt")
    var length = file.length()

    println(length)
    file.bufferedReader().use {
        reader->
        var currentLine = reader.readLine()
        while (currentLine!=null){
            println(currentLine)
            currentLine=reader.readLine()
        }
    }

}