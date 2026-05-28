package oop_103737_mohammadubaidurrachman.week06

fun processCheckout(
    method: PaymentMethod,
    amount: Double
) {

    println("-> Memulai checkout...")

    method.pay(amount)
}

fun main() {

    val myWatch = Smartwatch()

    myWatch.showTime()

    val myPhone = Smartphone()

    myPhone.turnOn()

    val pay1 = Gopay()

    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")

    processCheckout(
        method = pay1,
        amount = 50000.0
    )

    processCheckout(
        method = pay2,
        amount = 150000.0
    )

    println("\n=== SMART HOME SYSTEM ===")

    val lamp = SmartLamp(
        "1",
        "Ruang Tamu"
    )

    val speaker = SmartSpeaker(
        "2",
        "Google Nest Dapur"
    )

    val cctv = SmartCCTV(
        "3",
        "Ezviz Garasi"
    )

    val hub = SmartHomeHub()

    hub.addDevice(lamp)

    hub.addDevice(speaker)

    hub.addDevice(cctv)

    hub.activateSecurityMode()

    hub.turnOffAllSwitches()
}