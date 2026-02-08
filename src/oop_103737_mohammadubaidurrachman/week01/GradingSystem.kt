package oop_103737_mohammadubaidurrachman.week01

fun main() {
    val score = 85
    println(calculateStatus(score))
}

fun calculateStatus(score: Int) =
    if (score >= 75) "Pass" else "Fail"


