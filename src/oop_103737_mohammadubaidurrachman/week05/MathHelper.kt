package oop_103737_mohammadubaidurrachman.week05

class MathHelper {

    // Persegi
    fun hitungLuas(sisi: Int): Int {

        return sisi * sisi
    }

    // Persegi panjang
    fun hitungLuas(
        panjang: Int,
        lebar: Int
    ): Int {

        return panjang * lebar
    }

    // Lingkaran
    fun hitungLuas(jariJari: Double): Double {

        return 3.14 * jariJari * jariJari
    }
}