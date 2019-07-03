fun main(args: Array<String>) {
    
    
    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    // Using .asSequence() to work with big lists of data. They are lazily evaluated
    val titles = meetings
                    .asSequence()
                    .filter{it.title.endsWith("g")}
                    .map{it.title}

    iter(titles)

    val title = meetings
                    .asSequence()
                    .map{it.title.toUpperCase()}
                    find{ it.startsWith("BOARD")}

    println(title)
}

fun iter(seq:Sequece<String>){
    for (t in seq)
        println(t)
}

class Meeting(val id: Int, val title: String){
    val people = listOf(Person("Sam"), Person("Alex"))
}

data class Person(val name:String){

}