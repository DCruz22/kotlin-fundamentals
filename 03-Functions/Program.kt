package dariel

fun main(args: Array<String>) {
    log("Hello, World!")

    // Named parameters
    log(message = "Hello, World!", logLevel = 2)
    println(max(1,2))

    val text = "With    multiple \t whitespace"
    println(replaceMultipleWhiteSpace(text))
    println(text.replaceMultipleWhiteSpace())
}

// Default Parameters
fun log(message: String, logLevel: Int = 1){
    println(message + logLevel)
}

// Normal function
fun replaceMultipleWhiteSpace(value: String) : String{
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

// Extension Function
fun String.replaceMultipleWhiteSpace() : String{
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}

// Function as Expressions
fun max(a: Int, b: Int): Int = if(a<b) a else b