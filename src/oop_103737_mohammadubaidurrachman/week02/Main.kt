package oop_103737_mohammadubaidurrachman.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    if (nim.length != 10) {
        println("NIM tidak valid! Harus 10 digit.")
        return
    }

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    val student = Student(nim, name, major)

    println("\nData Mahasiswa:")
    println("NIM: ${student.nim}")
    println("Nama: ${student.name}")
    println("Jurusan: ${student.major}")
}
