package oop_103737_mohammadubaidurrachman.week06

class Smartphone : Camera, Phone {

    override fun turnOn() {

        super<Camera>.turnOn()

        super<Phone>.turnOn()

        println("Sistem operasi Smartphone berhasil booting.")
    }
}