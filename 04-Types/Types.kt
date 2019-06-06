
// Every type is public by default
interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: DarielTime) = setTime(time.hours)
}

interface EOW{
    fun setTime(time: DarielTime){}
}

class DarielTime{
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

class YetiTime : Time, EOW{

    override fun setTime(time: DarielTime){
        super<Time>.setTime(time)
        super<EOW>.setTime(time)
    }

    override fun setTime(hours: Int, mins: Int, secs: Int){}
}