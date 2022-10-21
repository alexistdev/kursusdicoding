package konsep.oop

class Animal3(var name: String, var weight: Double) {
    /**
     * ini adalah kelas untuk latihan di Extension Property
     * Dimana menggunakan getAnimalExtensionPropertiesInfo
     * */
    val Animal3.getAnimal3Info: String
        get() = "Nama: ${this.name}, Berat: ${this.weight}"
}