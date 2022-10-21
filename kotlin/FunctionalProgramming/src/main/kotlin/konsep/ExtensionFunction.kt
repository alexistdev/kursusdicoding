package konsep

fun main(){
    /** Extension function */
//    10.printInt()
    /** mengembalikan nilai */
    print(10.printInt())

}

/** Int adalah reviever type dan this ada objeknya*/
//fun Int.printInt(){
////    print("value $this")
//}
/** mengembalikan nilai */
fun Int.printInt(): Int{
    return this + 3
}