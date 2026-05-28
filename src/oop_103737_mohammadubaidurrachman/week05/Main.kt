package oop_103737_mohammadubaidurrachman.week05

fun main() {

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
        println("\n=== TEST OVERLOADING ===")
        val math = MathHelper()
        println("Luas Persegi: ${math.hitungLuas(4)}")
        println("Luas Persegi Panjang: ${math.hitungLuas(5, 3)}")
        println("Luas Lingkaran: ${math.hitungLuas(7.0)}")
    }
}