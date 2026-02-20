package oop_103737_mohammadubaidurrachman.week03

fun main() {

    println("=== Employee Test ===")
    val e = Employee("Budi", 1000)

    e.salary = 5000
    e.salary = -100

    e.updatePerformanceRating(4)

    println("Salary: ${e.salary}")
    println("Bonus: ${e.bonus}")
}