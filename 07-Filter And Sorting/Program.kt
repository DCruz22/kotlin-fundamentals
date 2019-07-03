fun main(args: Array<String>) {
    val ints = listOf(1,2,3,4,5)

    // Using filter for boolean operations
    val smallInts = ints.filter{ it < 4 }

    for(i: Int in smallInts)
        println(i)

    // Using map for transformation operations
    val squaredInts = ints.map{ it*it }

    for(i: Int in squaredInts)
        println(i)

    val smallSquaredInts = ints.
                            filter{ it < 5 }.
                            map{ it*it }

    for(i: Int in smallSquaredInts)
        println(i)

    
    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    val titles = meetings
                .filter{ it -> it.title.startsWith("C")}
                .map {m -> m.title}

    for(t in titles)
        println(t)

    // Declaring a predicate as a variable
    val greaterThanThree = { v:Int -> v > 3}

    var largeInts = ints.all(greaterThanThree)
    println(largeInts)

    largeInts = ints.any(greaterThanThree)
    println(largeInts)

    largeInts = ints.count(greaterThanThree)
    println(largeInts)

    largeInts = ints.find(greaterThanThree)
    println(largeInts)    
}

class Meeting(val id: Int, val title: String){
    val people = listOf(Person("Sam"), Person("Alex"))
}

data class Person(val name:String){

}