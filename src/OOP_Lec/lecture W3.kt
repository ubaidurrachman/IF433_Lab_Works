package OOP_Lecpackage

open class Karyawan {
    private var nama:String = "belum ada"
    private var gaji:Int = 0
    protected var namaPacar:String = "Pevita"

    public var umur:Int = 0
        set(value) {
            if(value<0){
                println("umur minus")
            } else {
                field = value
            }
        }
        get(){
            return field
        }

    public fun set_nama(namakamu:String){
        if(namakamu.length == 0){
            println("Tidak boleh kosong")
        } else {
            this.nama = namakamu
        }
    }
    public fun get_name():String {
        return this.nama + " ok"
    }

}

class DataPribadi: Karyawan() {

    public fun ambil_data_pacar(): String{
        return this.namaPacar
    }

}

fun main() {
    var dp = DataPribadi()
    println("Nama pacar: " + dp.ambil_data_pacar())
    println("nama karyawan: " + dp.get_name())
    dp.umur = -2
    println("Nama karyawan: " + dp.get_name() + " umur kmu: " + dp.umur)
}