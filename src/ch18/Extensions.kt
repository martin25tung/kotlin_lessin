package ch18

fun String.addEnthusiasm(amount: Int = 1) = this + "!".repeat(amount)

fun <T>T.easyPrint() : T{
    println(this)
    return this
}

fun main(args: Array<String>) {
    "Madrigal has left the building".easyPrint().addEnthusiasm().easyPrint()
    42.easyPrint()
}