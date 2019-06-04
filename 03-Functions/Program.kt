package dariel

fun main(args: Array<String>) {
    log("Hello, World!")
    log("Hello, World!", 2)
    println(max(1,2))
}

// Default Parameters
fun log(message: String, logLevel: Int = 1){
    println(message + logLevel)
}

// Function Expressions
fun max(a: Int, b: Int): Int = if(a<b) a else b