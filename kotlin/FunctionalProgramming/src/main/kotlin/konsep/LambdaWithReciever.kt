package konsep

fun main(){
    /** tanpa dsl */
//    val message = buildString()
//    println(message)
    /** dengan dsl */
    val message = buildString {
        append("Hello")
        append(" ")
        append("World")
    }

    println(message)
}

/** Konsep lama tanpa DSL (Domain Specific Langauges)
 * Konsep DSL menuliskan kode lebih ringkas, dimana user tidak perlu tau kerumitan sebuah fungsi.
 * */
//fun buildString(): String{
//    val stringBuilder = StringBuilder()
//    stringBuilder.append("Hello")
//    stringBuilder.append(" ")
//    stringBuilder.append("World")
//    return stringBuilder.toString()
//}

/** Disederhakanan dengan DSL*/
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}