package oop_103737_mohammadubaidurrachman.week05

class CreditCard(
    accountName: String,
    val limit: Double,
    var usedAmount: Double = 0.0
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {

        if (usedAmount + amount <= limit) {

            usedAmount += amount

            println("Pembayaran Credit Card berhasil.")
            println("Total terpakai: $usedAmount")
        }

        else {

            println("Transaksi ditolak. Limit terlampaui.")
        }
    }
}