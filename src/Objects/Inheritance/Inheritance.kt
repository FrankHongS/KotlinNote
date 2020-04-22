package Objects.Inheritance

class FinalConstruct(val name:String)

open class FlexibleConstruct(val name:String)

interface Singing{
    fun sing(){
        println("I can sing")
    }
}

interface Dancing{
    fun dance(){
        println("I can dance")
    }
}

//You can only have one supertype but multiple interfaces
class LessFlexible(name: String):FlexibleConstruct(name),Singing,Dancing{

}

fun main(args: Array<String>) {
    val finalConstruct=FinalConstruct("Frank")
    println("His name is ${finalConstruct.name}")

    val less=LessFlexible("Monica")
    println("her name is ${less.name}")
    less.dance()
    less.sing()
}