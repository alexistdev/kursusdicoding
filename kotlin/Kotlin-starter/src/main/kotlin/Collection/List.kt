package Collection

fun main(){
    val numberList = listOf(1,2,3,4,5)
    val charList = listOf('a','b','c')
    val anyList = listOf("a","kotlin",true,3,user())
    /** Mutable list */
    val muteAble = mutableListOf('a',"kotlin",3,true)

    muteAble.add(1)
    muteAble.add(2,false)
    muteAble[1]="dicoding"
    muteAble.removeAt(1)

    println(anyList[3])
}

fun user(){
//    println("user")
}
