fun main(){
    //integer
    val intNumber1  = 100

    //long
    val longNumber: Long = 100
    val longNumber2 = 100L

    //short
    val shortNumber: Short = 10

    //Byte
    val byteNumber2 = 0b11010010

    //Double
    val doubleNumber: Double = 1.3

    //Float
    val floatNumber: Float = 0.123456789f

    //max dan min value dari sebuah tipe data number
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    //Konversi tipe data Byte
    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt()

    //konversi tipe data string
    val stringNumber = "23"
    val intNumber3 = 3
//    println(intNumber3 + stringNumber.toInt())

    //readable
    val readableNumber = 1_000_000



    println(readableNumber)
}