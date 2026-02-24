package oop_103737_mohammadubaidurrachman.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    override fun honk(){
        println("TIN TIN! Mobil $brand lewat!")
        fun accelerate(){
            super.accelerate()
            println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan")
        }
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")

        }
    }

    fun openTrunk() {
        TODO("Not yet implemented")
    }
}