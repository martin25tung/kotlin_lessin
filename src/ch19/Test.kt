package ch19

fun main(args: Array<String>) {
    val animals = listOf("zebra", "giraffe", "elephant", "rat")
    val babies = animals.map{ animal -> "A baby $animal"}
        .map { baby -> "$baby, with the cutest little tail ever!" }
    println(babies)

    val tenDollarWords = listOf("auspicious", "avuncular", "obviate")
    val tenDollarWordLengths = tenDollarWords.map { it.length }
    print(tenDollarWordLengths)
    tenDollarWords.size
    tenDollarWordLengths.size

    listOf(listOf(1, 2, 3), listOf(4, 5, 6)).flatMap { it }

    val itemsOfManyColors = listOf(listOf("red apple", "green apple", "blue apple"),
        listOf("red fish", "blue fish"), listOf("yellow banana", "teal banana"))
    val redItems = itemsOfManyColors.flatMap { it.filter { it.contains("red") } }
    print(redItems)

}