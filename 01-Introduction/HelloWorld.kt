import cruz.dariel.Person

fun main(args: Array<String>) {
    println("Hello World") 

    var dariel = Person("Dariel")

    dariel.display()

    dariel.name = "Misael"

    dariel.display()
    println("Name is ${dariel.name}")
    dariel.displayWithLambda(::printName)
}

fun printName(name: String){
        println(name)
}