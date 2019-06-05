package dariel

fun main(args: Array<String>){
    val h1 = Header("h1")
    val h2 = Header("h2")

    val h3 = h1 plus h2
    println(h3.Name)

    val h4 = h1 + h2
    println(h4.Name)
}

class Header(var Name: String) {
    
}

// Infix function
// Operation overload
operator fun infix Header.plus(other: Header) : Header{
    return Header(this.name + other.name)
}