package konsep.SliceDistinctChunked

fun main(){
//    val total = listOf(1,2,3,4,5,6,7,8,9,10)
//    val slice = total.slice(3..6)
    /** ditambah step */
//    val slice = total.slice(3..6 step 2)
    /** slice dengan menentukan lokasi yang spesifik */
    val index = listOf(2,3,4,8)//3,4,5,9
    val total = listOf(1,2,3,4,5,6,7,8,9,10)
    val slice = total.slice(index)
    println(slice)
}