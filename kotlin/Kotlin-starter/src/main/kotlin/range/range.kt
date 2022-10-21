package range

fun main(){
    /** default step 1 */
//    val rangeInt = 1..10
//    print(rangeInt.step)

    /** step 2 */
//    val rangeInt = 1..10 step 2
//    rangeInt.forEach {
//        print("$it")
//    }
    /** rangeTo() */
//    val rangeInt = 1.rangeTo(10)
//    rangeInt.forEach {
//        print("$it")
//    }
    /** downTo() */
    val rangeInt = 10.downTo(1)
//    rangeInt.forEach {
//        print("$it")
//    }
    /** in */
//    if(7 in rangeInt){
//        println("Nilai 7 tersedia")
//    }
    /** !in */
    if(11 !in rangeInt){
        println("Tidak ada nilai 11")
    }

}