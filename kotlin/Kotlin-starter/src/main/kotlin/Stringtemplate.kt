fun main(){
    //string template tanpa + hanya menggunakan $
    val name = "Alex"
    val umur = 40
    println("My Name is $name, im $umur years old")

    //expression dengan format ${}
    val hour = 7
    print("Office ${if(hour > 7) "already close" else "is open"}")
}