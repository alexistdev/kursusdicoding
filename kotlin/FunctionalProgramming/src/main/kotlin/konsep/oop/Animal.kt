package konsep.oop

class Animal(val name: String,
val weight: Double,
val age: Int,
val isMamal: Boolean)    {

    fun eat(){
        println("$name makan!")
    }

    fun sleep(){
        println("$name tidur !")
    }

    val Animal.getAnimalInfo : String
        get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMamal}"
}