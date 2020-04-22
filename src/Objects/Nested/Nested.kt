package Objects.Nested

fun main(args: Array<String>) {
    val batman=Batman();
    val robin=Batman.Robin()

    batman.say()
    robin.say()
}

public class Batman(){
    fun say(){
        println("This is Batman")
    }

    public class Robin{
        fun say(){
            println("This is Robin")
        }
    }
}