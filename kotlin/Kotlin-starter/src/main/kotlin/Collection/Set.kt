package Collection

fun main(){
    /** set digunakan untuk menghilangkan duplikasi data di dalam collection */
//    val integerSet = setOf(1,2,4,1,3,5)
//    println(integerSet)
//    val setA = setOf(1, 2, 4, 2, 1, 5)
//    val setC = setOf(1,5,7)
//    val union = setA.union(setC)
//    val intersect = setA.intersect(setC)
//
//    println(union)
//    println(intersect)
    val mutableSet = mutableSetOf(1,2,3,4,5)
    mutableSet.add(6)
    mutableSet.remove(1)

    println(mutableSet)
}