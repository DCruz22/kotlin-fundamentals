fun fun main(args: Array<String>) {
    var program = Program()

    var total = 0;
    //program.fibonacci(8)

    // Using an anonymous class to implement the method
    program.fibonacci(8, object : Process{
        override fun execute(value: Int){
            println(value)
        }
    })

    // Using high order functions to simplify code
    program.fibonacci(8, {n -> println(n)})

    // Same result to method with one parameter 
    program.fibonacci(9, {println(it)})
    program.fibonacci(9, ::println)

    // Variables in Anonymous classes doesn't need to be final
    program.fibonacci(8, {it -> total += it})
    println(total)
}

// Using Stratefy in a OO way
interface Process{
    fun execute(value: Int)
}

class Program{

    fun fibonacci(limit: Int, action: (Int) -> Unit){
        var prev = 0
        var prevprev = 0
        var current = 1

        for(i: Int in 1..limit){
            action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int, action: Process){
        var prev = 0
        var prevprev = 0
        var current = 1

        for(i: Int in 1..limit){
            action.execute(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int){
        var prev = 0
        var prevprev = 0
        var current = 1

        for(i: Int in 1..limit){
            println(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}