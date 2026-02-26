package OOP_Lec.week04

open class Kendaraan {
    private var merk:String = ""
    private var kecepatan:Int = 0

    open fun jalan_maju() {
        println("Jalan $kecepatan km/jam cuyy")
    }
}