package konsep.memberReference

fun main(){
    /** mekanisme penulisan reflection */
//    val sum: (Int, Int) -> Int = ::count

    /** Dengan reference  */
    val numbers =  1.rangeTo(10)
//    val evenNumbers = numbers.filter(::isEvenNumber)
    //mereferensikan extension function
//    val evenNumbers = numbers.filter(Int::isEvenNumber)
//    println(evenNumbers)
}

/** mekanisme penulisan reflection */
//fun count(valueA: Int, valueB: Int): Int {
//    return valueA + valueB
//}

fun isEvenNumber(number: Int) = number % 2 == 0
