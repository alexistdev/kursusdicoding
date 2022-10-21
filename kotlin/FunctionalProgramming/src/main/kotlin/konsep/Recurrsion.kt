package konsep

fun main(){
    /** Tail Call Recursion */
    println("Factorial 9999 is: ${factorial(9999)}")
}

fun factorial(n: Int, result: Int=1):Int {
    val newResult = n * result;
    return if (n == 1){
        newResult
    } else {
        factorial(n -1 , newResult)
    }
}