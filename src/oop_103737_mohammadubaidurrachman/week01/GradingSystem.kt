package oop_103737_mohammadubaidurrachman.week01

fun main() {
    val score = 85

    val grade = when {
        score >= 85 -> "A"
        score >= 75 -> "B"
        else -> "C"
    }

    println("Grade = $grade")
}

