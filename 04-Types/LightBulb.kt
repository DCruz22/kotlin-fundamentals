sealed class PersonEvent{
    class Awake : PersonEvent()
    class Sleep: PersonEvent()
    class Eating(val food: String) : PersonEvent()
}

fun handlerPersonEvent(event: PersonEvent){
    when(event){
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Sleep-> println("Sleep")
        is PersonEvent.Eating -> println(event.food)
    }
}