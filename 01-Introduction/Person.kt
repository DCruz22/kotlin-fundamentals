package cruz.dariel

class Person (var name: String){
    fun display(){
        println("Display: ${name}")
    }

    fun displayWithLambda(func: (s:String) -> Unit){
        func(name)
    }
}