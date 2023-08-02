package limah.jonas.smartPhoneDobraveis

open class Phone(var isScreenLigthOn: Boolean = false){
    open fun switchOn(){
        isScreenLigthOn = true
    }
    fun switchOff(){
        isScreenLigthOn = false
    }
    fun checkPhoneScreenLight(){
        val phoneScreenLight: String = if(isScreenLigthOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}