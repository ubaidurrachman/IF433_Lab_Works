package oop_103737_mohammadubaidurrachman.week02


class Student(
    val nim: String,
    var name: String,
    var major: String
) {

    init {
        if (nim.length != 10) {
            println("WARNING: NIM harus 10 digit!")
        }
    }

    // Secondary Constructor
    constructor(nim: String, name: String) :
            this(nim, name, "Non-Matriculated")
}
