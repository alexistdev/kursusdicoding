package konsep.SliceDistinctChunked

fun main(){
    /** distinct membandingkan nilai collection yang sama (memfilter) */
    val total = listOf(1,2,1,2,3,4,5)
    val distinct = total.distinct()

    println(distinct)
}