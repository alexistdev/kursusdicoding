package konsep

fun main(){
    /** vararg untuk menyederhanakan jumlah parameter yang diinput pada fungsi */
//    val number = sumNumber(1,2,3)
    /** menginput nilai yang sudah berbentuk array ke dalam vararg */
    val numberArray = intArrayOf(1,2,3)
    val number = sumNumber(*numberArray)
    print(number)
}

fun sumNumber(vararg number:Int ): Int{
    return number.sum()
}