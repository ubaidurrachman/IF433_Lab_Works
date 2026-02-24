package oop_103737_mohammadubaidurrachman.week04

class ElectricCar(
    brand: String,
    numberOfDoors: Int,
    private val batteryCapacity: Int
) : Car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}