
fun main(args: Array<String>) {
    val m:Meeting? = null
    var newMeeting = Meeting()

    // Null-coalescing operator
    newMeeting = m? : Meeting()

    closeMeeting(m)
    closeMeeting(newMeeting)
    
    // Avoid explicit null check
    m?.let{
        closeMeetingNonNull(m)
    }
}

fun closeMeetingNonNull(m: Meeting): Boolean?{
    return if(m.canClose) m.close()
    else false

fun closeMeeting(m: Meeting?): Boolean?{
    // Using safe call
    return if(m?.canClose == true) m?.close()
    else false

    // Using not null assertion
    // return if(m!!.canClose) m.close()
    // else false
}

class Meeting {
    val canClose: Boolean = false
    lateinit val address: Address

    fun close(): Boolean{
        return true
    }

    fun save(o: Any){
        // Using safe cast to avoid exception
        val saveable = o as? ISaveable
        saveable?.save()
    }
    
    fun init(a: Addres){
        address =  a
    }
}

interface ISaveable{
    fun save()
}

class Addres{

}