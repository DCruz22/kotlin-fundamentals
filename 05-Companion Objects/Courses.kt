
class Course(val Id: Int, val Title: String){

}

// The object keyword created a singleton class
object Courses{
    var allCourses = arrayListOf<Course>()

    fun initialize(){
        allCourses.add(Course(1, "Kotlin Fundamentals"))
    }
}