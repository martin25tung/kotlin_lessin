package ch13

class Sword(_name: String) {
    var name = _name
    get() = "The legendary $field"
    set(value) {
        field = value.toLowerCase().reversed().capitalize()
    }
}

fun main(args: Array<String>) {
    val sword = Sword("Excalibur")
    println(sword.name)
}