package DataClassCollection

fun main(){
    val datauser= DataUser3("alex", 40)
//    val name = datauser.component1()
//    val age = datauser.component2()

    /** alternatif mendapatkan attribute */
//    val(name, age) = datauser

//    println("My name is $name, I am $age years old")

    /** data class dengan fungsi*/
    datauser.intro()
}

data class DataUser2(val name: String, val age: Int)

/** data class dengan fungsi */
data class DataUser3(val name: String, val age: Int){
    fun intro(){
        println("My name is $name, I am $age old")
    }
}