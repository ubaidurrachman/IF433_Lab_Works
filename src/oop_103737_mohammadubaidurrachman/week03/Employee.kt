package oop_103737_mohammadubaidurrachman.week03

class Employee(
    val name: String,
    salary: Int
) {

    var salary: Int = salary
        set(value) {
            this.salary = value //  sengaja salah (infinite recursion)
        }
}