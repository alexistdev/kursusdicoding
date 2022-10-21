package konsep.FoldDropTake

fun main(){
    /** take mirip dengan drop yaitu untuk menyaring item, akan mengambil data dari collection sebanyak n */
    val total = listOf(1,2,3,4,5,6)
//    val take = total.take(3)

    /** takeLast() mengambil dari index terakhir */
    val take = total.takeLast(3)
    println(take)
}