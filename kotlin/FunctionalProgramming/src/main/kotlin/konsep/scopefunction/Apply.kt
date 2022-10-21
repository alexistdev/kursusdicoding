package konsep.scopefunction

fun main(){
    val message = StringBuilder().apply{
        append("Hello ")
        append("World!")
    }

    println(message.toString())
}

