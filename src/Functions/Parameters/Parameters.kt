package Functions.Parameters

// primitive parameters (String ,Int,Float,etc) is passed by value
// so you cannot change the value of the passed parameter
fun primitives(name:String){
//     name="John Adams"
}

fun complex(p:Person){
    p.firstName="John"
    p.lastName="Adams"
}

data class Person(var firstName:String,var lastName:String)

fun main(args: Array<String>) {
    val president="JFK"
    println("President name is $president")
    primitives(president)
    println("Now the president is $president")

    val president2=Person("John","kennedy")
    println("President name is ${president2.firstName} ${president2.lastName}")
    complex(president2)
    println("Now the president name is ${president2.firstName} ${president2.lastName}")
}