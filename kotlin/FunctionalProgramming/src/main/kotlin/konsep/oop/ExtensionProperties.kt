package konsep

import konsep.oop.Animal
import konsep.oop.Animal3

fun main(){
    /** Dengan Extension properties , kita bisa mewarisi fungsi dari sebuah kelas tanpa perlu mewarisi keseluruhan kelas seperti dengan extends*/
    val dicodingCat = Animal("Dicoding Miaw", 5.0, 2, true)
//    println(dicodingCat.getAnimalInfo)
}