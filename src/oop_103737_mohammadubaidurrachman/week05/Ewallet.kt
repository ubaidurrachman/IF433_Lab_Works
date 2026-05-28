package oop_103737_mohammadubaidurrachman.week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {

        if (balance >= amount) {

            balance -= amount

            println("Pembayaran berhasil menggunakan EWallet.")
            println("Sisa saldo: $balance")
        }

        else {

            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {

        balance += amount

        println("Top up berhasil. Saldo sekarang: $balance")
    }
}