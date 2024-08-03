// Abstract class
abstract class PaymentMethod(val amount: Double, val status: String) {
    abstract fun processPayment()
    abstract fun showResume()
}


// Subclass 1
class CreditCardPayment(amount: Double, status:String, val cardNumber: String, ) : PaymentMethod(amount, status) {
    override fun processPayment() {
        println("Processing credit card payment of \$$amount using card number: $cardNumber")
    }

    override fun showResume() {
        println("The payment was $status")
    }


}

// Subclass 2
class PayPalPayment(amount: Double, status:String, val email: String) : PaymentMethod(amount, status) {
    override fun processPayment() {
        println("Processing PayPal payment of \$$amount using email: $email")
    }

    override fun showResume() {
        println("The payment was $status and the confirmation was sent to $email")
    }
}

fun main() {
    // instantiate
    val creditCardPayment = CreditCardPayment(100.0, "not made", "1234-5678-9876-5432")
    val payPalPayment = PayPalPayment(200.0, "made","user@example.com")

    // Process payments
    creditCardPayment.processPayment()
    creditCardPayment.showResume()
    payPalPayment.processPayment()
    payPalPayment.showResume()
}
