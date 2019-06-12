fun main(args: Array<String>) {
    var dariel = Student(1, "Dariel")
    var cruz = Student(1, "Dariel")

    println(dariel)

    if(dariel == cruz){
        println("Equal")
    }else{
        println("Not equal")
    }

    var newDariel = dariel.copy(name = "Julio")
}

// Override the equals() and hashMap() methods
data class Student(val id: Int, var name: String){

}