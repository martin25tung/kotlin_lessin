package ch06

fun main(args: Array<String>) {
    var beverage = readLine()
//    beverage = null

//    if (beverage != null) {
//        beverage = beverage.capitalize()
//    } else {
//        println("I can't do that without crashing - beerage was null!")
//    }
//
//    val beverageServed: String = beverage ?: "Buttered Ale"
//    println(beverageServed)

    beverage?.let{
        beverage = it.capitalize()
    } ?: println("I can't do that without crashing - beerage was null!")
}