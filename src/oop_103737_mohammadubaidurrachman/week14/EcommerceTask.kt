package oop_103737_mohammadubaidurrachman.week14

import java.io.File

class BadOrderProcessor {

    private val file = File("orders.csv")

    fun processOrder(
        customer: String,
        basePrice: Double,
        customerType: String
    ) {

        val finalPrice = when(customerType) {
            "VIP" -> basePrice * 0.90
            "REGULAR" -> basePrice
            else -> basePrice
        }

        println("Memproses pesanan $customer seharga $finalPrice")

        file.appendText("$customer,$finalPrice\n")

        println("Email terkirim! Pesanan $customer telah dikonfirmasi")
    }
}