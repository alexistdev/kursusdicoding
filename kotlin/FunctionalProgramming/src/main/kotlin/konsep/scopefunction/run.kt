package konsep.scopefunction

fun main(){
    val text="Hello"
    val result = text.run {
        val from = this
        val to  = this.replace("Hello", "Kotlin")
        "Replace text from $from to $to"
    }

    println("result : $result")
}