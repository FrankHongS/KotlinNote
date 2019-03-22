package Functions.Infix

fun main(args: Array<String>) {

    // using a function
    val say="Hello " add "world"
    println(say)

    val say2="Hello ".add("world 2")
    println(say2)

    //using a method
    val hello=HelloWorld()
    val say3=hello say "world 3"
    println(say3)

    val say4=hello.say("world 4")
    println(say4)
}

infix fun String.add(more:String):String=this+more

class HelloWorld(){
    infix fun say(more:String):String{
        return "Hello $more"
    }
}