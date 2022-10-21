package DataClassCollection

class User(val name : String, val age : Int){
    /** toString Manual */
//    override fun toString(): String {
//        return "User(name=$name, age=$age)"
//    }

    /** equals() manual */
    override fun equals(other: Any?): Boolean{
        if(this === other) return true
        if(javaClass != other?.javaClass) return false

        other as User

        if(name != other.name) return false
        if(age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result =  31 * result + age
        return result
    }
}

data class DataUser(val name: String, val age: Int)

fun main(){
    /** data class akan secara otomatis menghasilkan fungsi toString() */
    val user = User("alex", 40)
    val dataUser = DataUser("Geo", 2)

//    println(user)
//    println(dataUser)
    /** Fungsi equals() pada data class */
//    val dataUser2 = DataUser("Geo", 2)
//    val dataUser3 = DataUser("Tata", 4)
//    println(dataUser.equals(dataUser2))
//    println(dataUser.equals(dataUser3))
    val user2 = User("alex", 40)
    val user3 = User("Geo", 2)
    println(user.equals(user2))
    println(user.equals(user3))
}