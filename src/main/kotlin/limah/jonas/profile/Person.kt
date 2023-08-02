package limah.jonas.profile

class Person(val name: String, val age: Int, var hobby: String?, var referrer: Person?) {
    init{
        showProfile()
    }
    fun showProfile() {
        if (referrer != null && hobby != "" && hobby != null) {
            println("Name: $name ")
            println("Age: $age ")
            println("Likes to play $hobby,Has a referrer named ${referrer?.name}")
            return
        } else if (referrer != null) {
            println("Name: $name ")
            println("Age: $age ")
            println("Does not has a hobby,Has a referrer named ${referrer?.name}")
            return
        } else if (hobby != null) {
            println("Name: $name ")
            println("Age: $age ")
            println("Likes to play $hobby,Doesn't have a referrer.")
            return
        } else {
            println("Name: $name ")
            println("Age: $age ")
            println("Does not has a hobby  , Doesn't have a referrer.")
        }

    }
}