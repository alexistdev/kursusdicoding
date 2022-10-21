package BreakContinue

fun main(){
    /** Continue */
    val listOfInt = listOf(1,2,3,null,5,null,7)
//    for (i in listOfInt){
//        if(i == null) continue
//        print(i)
//    }
    /** break */
//    for(i in listOfInt){
//        if(i == null )break
//        print(i)
//    }

    /** Break dan Continue Label*/
    loop@ for (i in 1..10){
        println("Outside loop")

        for(j in 1..10){
            println("Inside Loop")
            if( j > 5 ) break@loop
        }
    }

}