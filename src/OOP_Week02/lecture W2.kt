package OOP_Week02

class MyCar {
    var warna: String = "abu";

    fun kecepatan(){
        println("Kecepatannya $warna nya luar biasa")
    }
}

fun main() {
    val myCar = MyCar()
    myCar.kecepatan();
    myCar.warna = "merah";

    println("Warna mobil ${myCar.warna}");
}