package ch19

import kotlin.system.measureNanoTime

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

    // 先過濾在合併
    val itemsOfManyColors = listOf(listOf("red apple", "green apple", "blue apple"),
        listOf("red fish", "blue fish"), listOf("yellow banana", "teal banana"))
    val redItems = itemsOfManyColors.flatMap { it.filter { it.contains("red") } }
    print(redItems)

    // 過濾非質數
    val numbers = listOf(7, 4, 8, 4, 3, 22, 18, 11)
    val primes = numbers.filter { number ->
        (2 until number).map { number % it }
            .none { it == 0 }
    }
    print(primes)

    // 用zip合併兩個集合 用employees當鍵值
    val employees = listOf("Denny", "Claudette", "Peter")
    val shirtSize = listOf("large", "x-large", "medium")
    val employeeShirtSizes = employees.zip(shirtSize).toMap()
    println(employeeShirtSizes["Denny"])

    // 用fold累加器
    val foldedValue = listOf(1, 2, 3, 4).fold(0) { accumulator, number ->
        println("Accumulated value: $accumulator")
        accumulator + (number * 3)
    }
    println("Final value: $foldedValue")

    // 從1到5000找出1000個質數
    val toList = (1..5000).toList().filter { it.isPrime() }.take(1000)
    println(toList.size)

    val oneThousandPrimes = generateSequence(3){value ->
        value + 1
    }.filter { it.isPrime() }.take(1000)
    println(oneThousandPrimes.elementAt(0))

    val listInNanos = measureNanoTime {
        val toList = (1..5000).toList().filter { it.isPrime() }.take(7919)
        println(toList.size)
    }

    val sequenceInNanos = measureNanoTime {
        val oneThousandPrimes = generateSequence(3){value ->
            value + 1
        }.filter { it.isPrime() }.take(1000)
        println(oneThousandPrimes.elementAt(0))
    }

    println("List completed in $listInNanos ns")
    println("Sequence completed in $sequenceInNanos ns")
}

// Extension to Int that determines whether a number is prime
fun Int.isPrime(): Boolean {
    (2 until this).map{
        if (this % it == 0) {
            return false // Not a prime!
        }
    }
    return true
}