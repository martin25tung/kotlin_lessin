package ch06

fun main(args: Array<String>) {
//    var beverage = readLine()?.capitalize()
//    beverage = null
    var beverage = readLine()?.let {
        if (it.isNotBlank()){
            it.capitalize()
        }else {
            "Buttered Ale"
        }
    }
    println(beverage)
}