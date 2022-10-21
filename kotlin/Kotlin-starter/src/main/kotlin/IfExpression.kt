fun main(){
//    val openHours = 7
//    val now = 20
//    val office: String
//    if(now > openHours){
//        office = "Office already open"
//    } else {
//        office = "Office is closed"
//    }

    //menyimpan hasil kondisi ke dalam variable
//    val openHours = 7
//    val now =  20
//    val office: String
//    office = if ( now > openHours ){
//        "Office already open"
//    } else {
//        "Office is closed"
//    }

    //Menggunakan else if
    val openHours = 7
    val now = 7
    val office: String
    office = if (now > 7){
       "Office already open"
    } else if (now == openHours) {
        "wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}