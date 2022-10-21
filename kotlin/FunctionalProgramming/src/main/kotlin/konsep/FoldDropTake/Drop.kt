package konsep.FoldDropTake

fun main(){
    /** Drop memangkas collection sesuai jumlah yang kita mau */
    val numbers = listOf(1,2,3,4,5)
//    val drop = numbers.drop(3)

    /** dropLast() memangkas dari index terakhir, descending */
    val drop = numbers.dropLast(3)


        println(drop)
}