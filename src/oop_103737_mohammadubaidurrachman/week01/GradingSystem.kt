package oop_103737_mohammadubaidurrachman.week01

fun calculateStatus(score: Int) =
    if (score >= 75) "Pass" else "Fail"

fun main() {
    val score: Int? = null
    val safeScore = score ?: 0

    println(calculateStatus(safeScore))
}

