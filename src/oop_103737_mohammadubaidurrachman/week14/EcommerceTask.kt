package oop_103737_mohammadubaidurrachman.week14

import java.io.File

// ==========================
// BAD CODE (VIOLATION)
// ==========================

class BadOrderProcessor {

    private val file = File("orders.csv")

    fun processOrder(
        customer: String,
        basePrice: Double,
        customerType: String
    ) {

        val finalPrice = when(customerType) {
            "VIP" -> basePrice * 0.90
            "REGULAR" -> basePrice
            else -> basePrice
        }

        println("Memproses pesanan $customer seharga $finalPrice")

        // VIOLATION SRP/DIP
        file.appendText("$customer,$finalPrice\n")

        // VIOLATION SRP/DIP
        println("Email terkirim! Pesanan $customer telah dikonfirmasi")
    }
}

// ==========================
// FIX SRP & DIP
// ==========================

interface OrderRepository {

    fun saveOrder(customer: String, price: Double)
}

class CsvOrderRepository(
    private val file: File
) : OrderRepository {

    override fun saveOrder(customer: String, price: Double) {

        file.appendText("$customer,$price\n")
    }
}

interface NotificationService {

    fun sendNotification(customer: String)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(customer: String) {

        println("Email terkirim ke $customer")
    }
}

// ==========================
// FIX OCP
// ==========================

interface PricingStrategy {

    fun calculate(price: Double): Double
}

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double {

        return price * 0.90
    }
}

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double {

        return price
    }
}

// ==========================
// SAFE ORDER PROCESSOR
// ==========================

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        customer: String,
        basePrice: Double,
        pricing: PricingStrategy
    ) {

        val finalPrice = pricing.calculate(basePrice)

        println("Processing order for $customer : $finalPrice")

        repo.saveOrder(customer, finalPrice)

        notifier.sendNotification(customer)
    }
}

// ==========================
// MAIN
// ==========================

fun main() {

    val repo = CsvOrderRepository(File("safe_orders.csv"))

    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(
        repo,
        notifier
    )

    processor.processOrder(
        "Ubai",
        100000.0,
        VipPricing()
    )

    processor.processOrder(
        "John",
        50000.0,
        RegularPricing()
    )
}