package oop_103737_mohammadubaidurrachman.week06

class Button(
    override val name: String
) : Clickable {

    override fun click() {

        println("Tombol '$name' berhasil diklik!")
    }
}