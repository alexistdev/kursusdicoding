package konsep.memberReference

fun main(){
//    /** inner function */
//    setWord("Makan")
    /** contoh Pemanfaatan inner function untuk validasi angka */
    println(jumlah(10,20))
}
//fun setWord(message: String){
//    /** inner function sebelumnya*/
////    fun printMessage(text: String){
////        println(text)
////    }
//    /** mengakses parameter function diluarnya dalam function induk */
//    fun printMessage(){
//        println(message)
//    }
//
////    printMessage(message)
//    printMessage()
//}

fun jumlah(valueA: Int, valueB: Int): Int {
    /** awalnya seperti ini bisa disederhanakan */
//    if (valueA == 0) {
//        throw IllegalArgumentException("valueA must be better than 0")
//    }
//
//    if (valueB == 0) {
//        throw IllegalArgumentException("valueB must be better than 0")
//    }
    fun validateNumber(value: Int){
        if(value == 0){
            throw java.lang.IllegalArgumentException("nilai harus lebih besar dari NOL")
        }
    }
    validateNumber(valueA)
    validateNumber(valueB)

    return valueA + valueB
}