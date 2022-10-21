package konsep.scopefunction

fun main(){
    /** fungsi also digunakan saat kita ingin menggunakan konteks dari objek sebagai argunmen tanpa harus mengubah nilainya"
     *
     */
    val text = "Hello Kotlin"
    val result = text.also{
        println("value length -> ${it.length}")
    }
    println("text -> $result")
}