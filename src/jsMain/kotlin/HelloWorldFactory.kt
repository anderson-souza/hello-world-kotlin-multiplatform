actual object HelloWorldFactory {
    actual fun createHelloWorldPrinter(): HelloWorldPrinter = JsHelloWorldPrinter
}

object JsHelloWorldPrinter : HelloWorldPrinter {
    override fun printHelloWord() {
        console.log("Hello world from JS")
    }
}