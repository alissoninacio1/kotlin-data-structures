interface Printer {
    fun print()
}

class SimplePrinter : Printer {
    override fun print() {
        println("Printing from SimplePrinter")
    }
}

class FancyPrinter : Printer {
    override fun print() {
        println("Printing from FancyPrinter with extra features")
    }
}

// DelegatingPrinter does not need to implement the print() method from the Printer interface.
// Instead, it delegates this implementation to a Printer object passed in the constructor.
class DelegatingPrinter(printer: Printer) : Printer by printer

interface Logger {
    fun log(message: String)
}

class ConsoleLogger : Logger {
    override fun log(message: String) {
        println("Logging to console: $message")
    }
}

class FileLogger : Logger {
    override fun log(message: String) {
        println("Logging to file: $message")
    }
}

// DelegatingLogger does not need to implement the log() method from the Logger interface.
// Instead, it delegates this implementation to a Logger object passed in the constructor.
class DelegatingLogger(logger: Logger) : Logger by logger

fun main() {
    // Using DelegatingPrinter
    val simplePrinter = SimplePrinter()
    val fancyPrinter = FancyPrinter()

    val delegatingPrinter1 = DelegatingPrinter(simplePrinter)
    val delegatingPrinter2 = DelegatingPrinter(fancyPrinter)

    // delegatingPrinter1.print() delegates the call to simplePrinter.print()
    delegatingPrinter1.print()  // Output: Printing from SimplePrinter

    // delegatingPrinter2.print() delegates the call to fancyPrinter.print()
    delegatingPrinter2.print()  // Output: Printing from FancyPrinter with extra features

    // Using DelegatingLogger
    val consoleLogger = ConsoleLogger()
    val fileLogger = FileLogger()

    val delegatingLogger1 = DelegatingLogger(consoleLogger)
    val delegatingLogger2 = DelegatingLogger(fileLogger)

    // delegatingLogger1.log() delegates the call to consoleLogger.log()
    delegatingLogger1.log("This is a console log.")  // Output: Logging to console: This is a console log.

    // delegatingLogger2.log() delegates the call to fileLogger.log()
    delegatingLogger2.log("This is a file log.")     // Output: Logging to file: This is a file log.
}
