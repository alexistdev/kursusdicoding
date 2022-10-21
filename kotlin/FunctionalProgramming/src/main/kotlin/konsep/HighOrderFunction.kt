package konsep

fun main(){
    /** fungsi yang menggunakan fungsi lain sebagai parameter */
//    printResult(10, sum)
    /** atau bisa disederhanakan */
    printResult(10){
        value -> value +value
    }
}

var sum: (Int) -> Int = { value -> value + value }

fun printResult(value: Int, sum: (Int) -> Int){
    val result = sum(value)
    println(result)
}