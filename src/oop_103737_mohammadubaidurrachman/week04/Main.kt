package oop_103737_mohammadubaidurrachman.week04

fun main() {
    println("Testing Vehicle")
    val generatedVehicle = Vehicle(brand = "Sepeda Onthel")
    generatedVehicle.honk()
    generatedVehicle.accelerate()

    fun main() {
        val tesla = ElectricCar("Tesla", 4, 90)
        tesla.accelerate()
    }
    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}