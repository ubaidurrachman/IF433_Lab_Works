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
}