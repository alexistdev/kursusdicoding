package Collection

fun main(){
    /** menerapkan lazy atau vertical evaluation dengan asSequence() */
//    val list = (1..10000).toList()
//    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    /** objek sequence dengan generateSequence() */
    val sequenceNumber =  generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it") }

}