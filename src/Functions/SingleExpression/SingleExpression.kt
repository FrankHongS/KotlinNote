package Functions.SingleExpression

fun main(args: Array<String>) {
    fun sayHello(name: String)= "hello $name"

    fun triple(number:Int)=3*number

    for(x in 1..triple(2))
        println("$x . ${sayHello("Adam")}")
}