package oop_103737_mohammadubaidurrachman.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Pilih jalur pendaftaran:")
    println("1. Dengan Jurusan")
    println("2. Tanpa Jurusan")
    print("Pilihan: ")
    val choice = scanner.nextInt()
    scanner.nextLine()

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    val student = if (choice == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        Student(nim, name, major)
    } else {
        Student(nim, name)
    }

    println("\nData Mahasiswa:")
    println("NIM: ${student.nim}")
    println("Nama: ${student.name}")
    println("Jurusan: ${student.major}")
    println("IPK: ${student.gpa}")

    println("\n=== Sistem Peminjaman Buku ===")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\nDetail Peminjaman:")
    println("Judul: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration}")
    println("Denda: Rp ${loan.calculateFine()}")

    println("\n=== MINI RPG ===")

    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Base Damage: ")
    val damage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val choiceBattle = scanner.nextInt()
        scanner.nextLine()

        if (choiceBattle == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            println("HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy menyerang balik!")
                hero.takeDamage(enemyDamage)
                println("HP Hero: ${hero.hp}")
            }
        } else {
            println("Kamu kabur!")
            break
        }
    }

    if (hero.hp > 0 && enemyHp <= 0) {
        println("Hero menang!")
    } else if (hero.hp <= 0) {
        println("Hero kalah!")
    }


}
