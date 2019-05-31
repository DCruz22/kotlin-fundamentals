fun main(args: Array<String>){
    println("Hello World")

    // Mutable variable
    var q = Question()
    q = Question();

    // Immutable variable
    val k = Question()

    q.Answer = "42"
    //q.Question = "" 
    
    q.display()

    // String Templates
    println("The answer to the question ${q.Question} is ${q.Answer}")

    // If is an expresion that can return a value
    val message = if(q.Answer == q.CorrectAnswer){
        "You were correct"
    }else{
        "Try again?"
    }

    println(message)
}

class Question{
    var Answer:String = ""
    val CorrectAnswer = "42"
    val Question: String = "Whats the answer to life, universe and everything?"    

    fun display(){
        println("You said: $Answer")
    }
}