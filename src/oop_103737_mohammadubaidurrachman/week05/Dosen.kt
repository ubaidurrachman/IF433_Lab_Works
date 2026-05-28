package oop_103737_mohammadubaidurrachman.week05

class Dosen(
    nama: String,
    val nidn: String
) : Pegawai(nama) {

    override fun bekerja() {

        println("$nama sedang menyiapkan materi perkuliahan dan meneliti RPPKS.")
    }

    fun mengajar() {

        println("$nama sedang mengajar mahasiswa di kelas.")
    }
}