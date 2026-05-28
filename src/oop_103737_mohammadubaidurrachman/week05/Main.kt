package oop_103737_mohammadubaidurrachman.week05

fun main() {

    // =========================
    // POLYMORPHISM PEGAWAI
    // =========================

    val dosen1 = Dosen(
        nama = "Pak Alex",
        nidn = "0123456"
    )

    val admin1 = Admin(
        nama = "Bu Siti"
    )

    // Polymorphic Collection
    val daftarPegawai: List<Pegawai> =
        listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {

        // Runtime Polymorphism
        pegawai.bekerja()

        // Smart Casting
        when (pegawai) {

            is Dosen -> {

                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")

                pegawai.mengajar()
            }

            is Admin -> {

                println("=> Terdeteksi sebagai Admin")

                pegawai.doAdminWork()
            }
        }

        println("----------------------")
    }

    // =========================
    // TEST OVERLOADING
    // =========================

    println("\n=== TEST OVERLOADING ===")

    val math = MathHelper()

    println("Luas Persegi: ${math.hitungLuas(4)}")

    println("Luas Persegi Panjang: ${math.hitungLuas(5, 3)}")

    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

    // =========================
    // PAYMENT SYSTEM
    // =========================

    println("\n=== PAYMENT SYSTEM ===")

    val ewallet = EWallet(
        "Ubai Wallet",
        50000.0
    )

    val creditCard = CreditCard(
        "Ubai Card",
        100000.0
    )

    val paymentMethods: List<PaymentMethod> =
        listOf(ewallet, creditCard)

    for (payment in paymentMethods) {

        println("\nPembayaran menggunakan ${payment.accountName}")

        payment.processPayment(75000.0)

        // Smart Casting
        if (payment is EWallet) {

            println("EWallet terdeteksi, melakukan top up...")

            payment.topUp(50000.0)

            println("Mencoba pembayaran ulang...")

            payment.processPayment(75000.0)
        }
    }
}