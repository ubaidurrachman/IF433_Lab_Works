package oop_103737_mohammadubaidurrachman.week05

abstract class PaymentMethod(
    val accountName: String
) {

    abstract fun processPayment(
        amount: Double
    )
}