package ch07

const val TAVERN_NAME = "Taernyl's Folly"

fun main(args: Array<String>) {

    placeOrder("shandy,Dragon's Breath, 5.91")
//    placeOrder("elixir, Shirley's Timple, 4.12")

//    val omShymbol = '\u0950'
//    println(omShymbol)
//
//    "Dragon's Breath".forEach { println("$it") }



}

private fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Madrigal speaks with $tavernMaster about their order.")

    val (type, name, price) = menuData.split(',')
    val message = "Madrigal buys a $name ($type) for $price"
    println(message)

    val phrase = if (name == "Dragon's Breath") {
//        "Madrigal exclaims ${toDragonSpeak("Ah, delicious $name")}"
        "$name: ${toDragonSpeak("IT'S GOT WHAT ADVENTURERS CRAVE!")}"
    } else {
        "Madrigal says: Thanks for the $name"
    }
    println(phrase)
}

private fun toDragonSpeak(phrase: String) = phrase.replace(Regex("[aeiouAEIOU]")) {
    when (it.value) {
        "a","A" -> "4"
        "e", "E" -> "3"
        "i", "I" -> "1"
        "o", "O" -> "0"
        "u", "U" -> "|_|"
        else -> it.value
    }
}