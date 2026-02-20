package oop_103737_mohammadubaidurrachman.week03

class Employee(
    val name: String,
    salary: Int
) {

    var salary: Int = salary
        set(value) {
            if (value < 0) {
                println("WARNING: Salary tidak boleh negatif!")
            } else {
                field = value
            }
        }

    // 🔒 private property
    private var performanceRating: Int = 0

    // public method untuk update aman
    fun updatePerformanceRating(newRating: Int) {
        if (newRating in 1..5) {
            performanceRating = newRating
        } else {
            println("Rating harus antara 1 sampai 5")
        }
    }
}