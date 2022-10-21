package konsep.scopefunction

fun main(){
    /** Penggunaan let dapat mengurangi penggunaan operator safe call*/

    /** ini sebeelum let */
//    val message: String? = null
//    val length = message?.length ?:0 *2
//    val text = "text length $length"
//    println(text)

    /** disederhanakan dengan let */
//    val message: String? = null
//    message?.let{
//        val length = it.length * 2
//        val text = "text length $length"
//        println(text)
//    }

    /** let dengan run akan menjalankan logika kode lain jika objek bernilai null */
    val message: String? = null
    message?.let{
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }
}