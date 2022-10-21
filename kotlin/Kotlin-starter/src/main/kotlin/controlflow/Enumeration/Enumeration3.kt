package controlflow.Enumeration

fun main(){
//    val colors: Array<Color> = Color.values()
//    colors.forEach { color ->
//        print("$color ")
//    }

    /** valueOf */
//    val color: Color = Color.valueOf("RED")
//    print("Color is $color")

//    val colors: Array<Color> = enumValues()
//    colors.forEach{color ->
//        println(color)
//    }
//
//    val color: Color = enumValueOf("RED")
//    println("Color is $color")

    /** Ordinal */
//    val color: Color = Color.GREEN
//    print("Position GREEN is ${color.ordinal}")

    /** Mengecek instance dari enum */
    val color: Color = Color.GREEN

    when(color){
        Color.RED -> print("Color is RED")
        Color.BLUE -> print("Color is BLUE")
        Color.GREEN -> print("Color is GREEN")
    }
}
enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}