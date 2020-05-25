package ch13

class Sword(_name: String) {
    var name = _name
    get() = "The legendary $field"
    set(value) {
        field = value.toLowerCase().reversed().capitalize()
    }

    init {
        name = _name
    }
}

fun main(args: Array<String>) {
    val sword = Sword("Excalibur")
    println(sword.name)
//    sword.name = "Gleipnir"
//    println(sword.name)
}