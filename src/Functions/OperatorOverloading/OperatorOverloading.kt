package Functions.OperatorOverloading

fun main(args: Array<String>) {

    val batman=SuperPower()
    batman.say()
    +batman
    batman.say()
    -batman
    batman.say()

    val robin=SuperPower()
    robin.say()

}

class SuperPower(){

    var power:Int=1
    var action="Neutral"

    operator fun unaryPlus(){
        power++
        action="+"
    }

    operator fun unaryMinus(){
        power--
        action="-"
    }

    fun say(){
        println("$action $power")
    }

    override fun toString(): String ="$power"
}