package Objects.Invokableobjects

/* You can use any type that has an operator function named invoke() in a callee position:*/
interface Superhero{
    public operator fun invoke()
}

class Batman:Superhero{
    override operator fun invoke() {
        println("Batman punches")
    }
}

class Superman{

}

operator fun Superman.invoke(){
    println("Superman flies")
}

fun invoke(x:Batman){
    x()
}

fun invoke2(x:Superhero){
    x()
}

fun invoke3(x:Superman){
    x()
}

fun main(args: Array<String>) {
    val darkNight=Batman()
    val clark=Superman()

    invoke(darkNight)
    invoke2(darkNight)
    invoke3(clark)
}


