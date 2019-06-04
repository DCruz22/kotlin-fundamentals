import java.util.*

fun main(args: Array<String>){
    println("Hello World")

    // Mutable variable
    // 
    var q:Question? = null

    // Immutable variable
    val k = Question()

    q?.Answer = "42"
    //q.Question = "" 
    
    q?.display()

    // String Templates
    println("The answer to the question ${q?.Question} is ${q?.Answer}")

    // If is an expresion that can return a value
    val message = if(q?.Answer == q?.CorrectAnswer){
        "You were correct"
    }else{
        "Try again?"
    }

    println(message)
    
    q = Question();
    
    q.printResult()

    // Try can be used as an expression
    val number: Int? = try{Integer.parseInt(q.Answer)}
    catch(e:NumberFormatException){
        null
    }

    println("Number is $number")    
}

class Question{
    // Nullable type
    var Answer:String? = null
    val CorrectAnswer = "42"
    val Question: String = "Whats the answer to life, universe and everything?"    

    fun display(){
        println("You said: $Answer")
    }

    fun printResult(){
        // When Statement        
        when (Answer){
            CorrectAnswer -> print("You were Correct")
            else -> print("Try again?")
        }
    }
}

fun ranges(){
    // Loops and Ranges

    var myValues = 1..10;

    for(i in myValues){
        println(i)
    }

    for(i in 10 downTo 1 step 2){
        println(i)
    }

    var numbers = listOf(1,2,3,4,5)
    for((index, element) in numbers.withIndex()){
        println("$element at $index")
    }
    
    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 25
    ages["Sam"] = 21
    ages["Harry"] = 15
    ages["Alex"] = 55

    for((name,age) in ages){
        println("$name is $age")
    }

    var letter = 'a'..'z'
}

fun exceptions(){
    var reader = FileReader("filename")

    // Not necessary but similar to Java
    try {
        reader.ReadFile();
    }
    catch(Exception e) {
        
    }finally{

    }
}