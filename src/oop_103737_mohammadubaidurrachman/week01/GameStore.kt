package oop_103737_mohammadubaidurrachman.week01

fun main() {
    val gameTitle = "Cyber Adventure"
    val price = 600000

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )

    val userNote: String? = null
    println("Note: ${userNote ?: "Tidak ada catatan"}")
}



fun calculateDiscount(price: Int) =
    if (price > 500000) price * 80 / 100
    else price * 90 / 100

fun printReceipt(title: String, finalPrice: Int) {
    println("Game Title : $title")
    println("Final Price: $finalPrice")
}
