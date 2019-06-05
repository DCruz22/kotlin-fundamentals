package dariel

fun main(args: Array<String>) {
    println(fib(10, BigInteger("1"), BigInteger("0")))
}

// Tail recurssion functions
tailrec fun fib(n: Int,  a: BigInteger, b: BigInteger) : BigInternet{
    return if (n == 0) b else fib(n-1, a + b, a)    
}