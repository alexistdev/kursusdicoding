package konsep

/** Penggunaan Lambda */
fun main(){
//    message()
    messageWithParameter("Hello World");
}

//val message = { println("Hello World") }
/** kita bisa menambahkan parameter */
val messageWithParameter = { message: String -> println(message)}