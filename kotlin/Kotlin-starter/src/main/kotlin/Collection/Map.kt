package Collection

fun main(){
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India",
    )
//
//    println(capital["Jakarta"])
//    println(capital.getValue("Jakarta"))
//    println(capital.keys)
    /** Mutable */
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(capital.keys)
}