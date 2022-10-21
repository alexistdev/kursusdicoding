package konsep

import konsep.oop.Animal
import konsep.oop.Animal2

fun main(){
    /** Animal 1*/
//    val animal = Animal("Dolly",4.2,2,true)
//    println("Nama: ${animal.name}, Berat: ${animal.weight}, Umur: ${animal.age}, Mamalia: ${animal.isMamal}")
//    animal.eat()
//    animal.sleep()

    /** Animal 2 overide class*/
    val animal = Animal2()
    println("Nama:${animal.name}")
    animal.name = "goose"
    println("Nama: ${animal.name}")
}