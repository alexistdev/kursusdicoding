package konsep

fun main(){
//    val fullName = getFullName(middle = "hendra" , first = "alex")
    val fullName = getFullName()
    println(fullName)
}

/** namedArgument */
//fun getFullName(first: String, middle: String): String{
//    return "$first $middle"
//
// }

/** with default value */
fun getFullName(first: String = "Samantha", middle: String = "Wijaya"): String{
    return "$first $middle"
}