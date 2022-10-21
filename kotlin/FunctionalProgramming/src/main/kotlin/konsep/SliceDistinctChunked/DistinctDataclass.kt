package konsep.SliceDistinctChunked

fun main(){
//    val items = listOf(
//        Item("1","kotlin"),
//        Item("2","is"),
//        Item("3","awesome")
//    )
//    val disctinctItems = items.distinctBy { it.key }
//    disctinctItems.forEach{
//        println("${it.key} with value ${it.value}")
//    }

    /** menyarin dengan distinctBy */
    val text = listOf("A", "BB", "CC","DD", "EEE", "F", "GGG")
    val distinct = text.distinctBy {
        it.length
    }
    println(distinct)
}

data class Item(val key: String, val value: Any)