package oop_103737_mohammadubaidurrachman.week01

fun main(args: Array<String>) {

    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println(checkSize(area))


    checkSize(area)
}


fun checkSize(area: Double) =
    if (area > 100) "This is a Big Circle"
    else "This is a Small Circle"
