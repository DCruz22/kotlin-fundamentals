class Meeting{
    var Title: String = ""
    var When: Date = Date()
    var Who = mutableListOf<String>()

    fun create(){}
}

fun main(args: Array<String>) {
    val m = Meeting()
    m.Title = "Board meeting"
    m.When = Date(2019,06,26)
    m.Who.add("Dariel")

    with(m){
        Title = "Board meeting1"
        When = Date(2019,06,22)
        Who.add("Juan")
    }

    m.apply{
        Title = "Board meeting1"
        When = Date(2019,06,22)
        Who.add("Juan")
    }.create()
}