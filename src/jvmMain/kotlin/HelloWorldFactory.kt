actual object HelloWorldFactory {
    actual fun createHelloWorldPrinter(): HelloWorldPrinter = JvmHelloWorldPrinter
}

object JvmHelloWorldPrinter : HelloWorldPrinter {
    override fun printHelloWord() {
        println("Hello World from Kotlin")
    }
}