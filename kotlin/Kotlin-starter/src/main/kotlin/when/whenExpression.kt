package `when`

fun main(){
//    val value = 8
    /** when dengan else*/
//    when(value){
//        6 -> println("Value is 6")
//        7 -> println("Value is 7")
//        8 -> println("Value is 8")
//        else -> println("Nilai tidak ditemukan")
//    }

    /** when disimpan ke dalam variabel*/
//    val Nilai = when(value){
//        6 -> println("value is 6")
//        7 -> println("value is 7")
//        8 -> println("value is 8")
//        else -> println("Data tidak ditemukan")
//    }
    /** Mengeksekusi 2 baris perintah */
//    val value = 8
//    val nilai = when (value){
//        6 -> {
//            println("enam")
//            "Nilai adalah 6"
//        }
//        7 -> {
//            println("tujuh")
//            "Nilai adalah 7"
//        }
//        else -> {
//            println("Tidak ada")
//            "Nilai tidak ditemukan"
//        }
//    }
//    println(nilai)

    /** Memeriksa instance dengan tipe tertentu */
    val sebuahData : Any = 100L
    when (sebuahData){
        is Long -> println("Tipe data adalah Long")
        is String -> println("Tipe data adalah string")
        else -> println("undefined")
    }
}