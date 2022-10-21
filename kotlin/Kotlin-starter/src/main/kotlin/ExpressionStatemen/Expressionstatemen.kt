package ExpressionStatemen


fun main(){
    /** Expression di dalam expresion, 1* 4 adalah expresion yang ada di dalam fungsi sum yang juga mengembalikan nilai */
    print(sum(1, 1* 4))
}

fun sum(value1: Int, value2: Int) = value1 + value2