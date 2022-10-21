fun main(){
    val text =  "Kotlin"
    val firstChar = text[0]

    print("First character of $text is $firstChar")
    println("")

    for(char in text){
        print("$char ")

    }
    println("")

    //escape string
    val statement = "Kotlin is \"Awesome!\""
    println(statement)

    //raw string
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
        """.trimIndent()

    println(line)
}
