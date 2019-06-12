
fun main(args: Array<String>) {
    val dariel = Student("Dariel", "Cruz", 2)
    print(dariel.Id)
}

abstract class Person(var firstName: String, var lastName: String){    
    open fun getName() : String = "$firstName $lastName"
    abstract fun getAdderss():String
}

// Classes and Methods are final by default
class Student(var firstName: String, var lastName: String, _Id: Int) : Person(firstName, lastName){
    val id : Int
    var tutor : String

    // Primary constructor
    init{
        id = _Id
        tutor = ""
    }

    // Secondary constructor
    constructor(var firstName: String, var lastName: String, _Id: Int, tutor:String) : this(firstName, lastName, _Id){
        this.tutor = tutor
    } 

    override fun getName() : String{
        return ""
    }

    override fun getAdderss():String{
        return ""
    }

}