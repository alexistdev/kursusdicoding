fun main(){
    val user = setUser("Andika",23)
    val user2 = setUser3("Andika",23)
    println(user)
    println(user2)
    printUser("Hendra")
}
//penulisan fungsi pada umumnya
fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}
//fungsi yang hanya memiliki satu nilai kembalian maka dapat disederhanakan menjadi seperti ini
fun setUser2(name: String, age: Int): String="Your name is $name, and you $age years old"

//expresion body, compiler dapat secara otomatis menentukan tipe nilai kembalian.
fun setUser3(name: String, age: Int)="Your name is $name, and you $age years old"

//tanpa kembali nilai, tipe data unit dapat dihilangkan karena dianggap redundant sehingga disederhanakan seperti dibawah ini
fun printUser(name: String) {
    println("Your name is $name")
}