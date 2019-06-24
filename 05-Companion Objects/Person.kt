
fun main(args: Array<String>) {
    val dariel = Student("Dariel", "Cruz", 2)
    print(dariel.Id)

    Student.createPostgraduate("Juan")
    Student.createUndergrad("Pedro")
}

class Program {
    companion object{
        //Make the Jvm see a method as static
        @JvmStatic
        fun main(args: Array<String>) {
            val dariel = Student("Dariel", "Cruz", 2)
            print(dariel.Id)

        }
    }
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

    fun enrole(courseName : String){
        val course = Courses.allCourses
                    .filter(it.Title == courseName)
                    .firstOrNull()
    }

    override fun getName() : String{
        return ""
    }

    override fun getAddress():String{
        return ""
    }

    //Provide Factory functionality. Methods are static
    companion object : XmlSerializer<Student> {

        override fun toXml(item: Student){

        }
        
        fun createUndergrad(name: String) : Undergraduate{
            return Undergraduate(name)
        }

        fun createPostgraduate(name: String) : Postgraduate{
            return Postgraduate(name)
        }
    }
}

class Undergraduate(firstName: String) : Student(firstName, "", 1){

}

class Postgraduate(firstName: String) : Student(firstName, "", 1){
    
}

interface XmlSerializer<T>{
    fun toXml(item: T)
}