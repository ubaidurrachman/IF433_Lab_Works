package oop_103737_mohammadubaidurrachman.week04

fun main() {

    fun main() {
        val manager = Manager("Budi", 10_000_000)
        val developer = Developer("Ani", 8_000_000, "Kotlin")

        manager.work()
        println("Bonus Manager: Rp ${manager.calculateBonus()}")

        developer.work()
        println("Bonus Developer: Rp ${developer.calculateBonus()}")
    }
    println("=== Electric Car Test ===")

    val tesla = ElectricCar("Tesla", 4, 90)

    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()
}