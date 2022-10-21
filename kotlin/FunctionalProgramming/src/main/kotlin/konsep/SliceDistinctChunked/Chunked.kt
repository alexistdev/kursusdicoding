package konsep.SliceDistinctChunked

fun main(){
    /** chunked mirip dengan split, tetapi bedanya split membutuhkan argumen Regex sedangkan chuncked membutuhkan nilai */
    val word = "QWERTY"
//    val chunked = word.chunked(3)

    /** Memodifikasi isi chunked */
    val chunked = word.chunked(3) {
        it.toString().toLowerCase()
    }

        println(chunked)
}