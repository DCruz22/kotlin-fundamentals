abstract class Person{
    var firstName: String = ""
    var lastName: String = ""

    open fun getName() : String = "$firstName $lastName"
    abstract fun getAdderss():String
}

// Classes and Methods are final by default
class Student : Person{
    override fun getName() : String{
        return ""
    }

    override fun getAdderss():String{
        return ""
    }

}