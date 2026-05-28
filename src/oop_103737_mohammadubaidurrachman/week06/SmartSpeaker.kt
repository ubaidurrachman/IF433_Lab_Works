package oop_103737_mohammadubaidurrachman.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {

        println("$name speaker menyala.")
    }

    override fun turnOff() {

        println("$name speaker dimatikan.")
    }

    fun playMusic(song: String) {

        println("Memutar lagu $song dari Spotify.")
    }
}