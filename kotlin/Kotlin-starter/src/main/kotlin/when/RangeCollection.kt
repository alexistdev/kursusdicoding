package `when`

import kotlin.random.Random

fun main(){
//    val nilai = 27
//    val dataNilai = 10..50
//    when(nilai){
//        in dataNilai -> println("Nilai ada di dalam data")
//        !in dataNilai -> println("Nilai tidak ada di dalam data")
//        else -> println("Undefined")
//    }
    /** Menangkap subjek dari when expression */
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

}

fun getRegisterNumber() = Random.nextInt(100)