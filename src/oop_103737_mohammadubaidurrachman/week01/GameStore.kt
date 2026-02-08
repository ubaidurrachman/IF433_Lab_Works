package oop_103737_mohammadubaidurrachman.week01

fun main() {
    val gameTitle = "Cyber Adventure"
    val price = 600000
}

fun calculateDiscount(price: Int) =
    if (price > 500000) price * 80 / 100
    else price * 90 / 100
