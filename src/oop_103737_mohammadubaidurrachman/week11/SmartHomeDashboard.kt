package oop_103737_mohammadubaidurrachman.week11

fun main() {

    val homeDevices = mutableListOf<SmartDevice>()

    // Philips lamp
    SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    // Camera
    SmartDevice("Ezviz Outdoor", "Camera")
        .apply {
            isOnline = true
            powerLoad = 5
        }
        .also {
            println("(LOG) Kamera terhubung")
            homeDevices.add(it)
        }

    // AC pakai run
    val ac = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(ac)

    // Pet feeder
    homeDevices.add(
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    )

    // Search pakai let
    val searchResult = homeDevices.find {
        it.category == "Camera"
    }

    searchResult?.let {
        println(it.diagnose())
    }

    // with summary
    with(homeDevices) {
        println("Total device: ${this.size}")
    }

    // total power
    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }

    println("Total Power: $totalPower Watt")

    // print semua
    homeDevices.forEach {
        println(it.diagnose())
    }
}