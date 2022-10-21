fun main(){
    /** Perulangan dengan range expression */
//    val ranges = 1..5
//    for(i in ranges){
//        println("value is $i!")
//    }
    /** rangeTo */
//    val ranges = 1.rangeTo(5)
//    for(i in ranges){
//        println("Value is $i")
//    }
    /** rangeTo + step */
//    val ranges = 1.rangeTo(10) step 3
//    for(i in ranges){
//        println("value is $i")
//    }
    /** withIndex() */
    val ranges = 1.rangeTo(10) step 3
//    for((index, value) in ranges.withIndex()) {
//        println("value $value with index $index")
//    }
    /** forEach */
//    ranges.forEach { value ->
//        println("value is $value")
//    }
    /** forEach Index */
//    ranges.forEachIndexed { index, value ->
//        println("value $value with index $index")
//    }

    /** forEach index dimana value diganti menjadi _ */
    ranges.forEachIndexed { index, _ ->
        println(" index $index")
    }
}