package Objects.DataClass

/* This sample demonstrates various features that you get from using a data class */

data class SuperHero(val firstname:String,val lastName:String)

fun main(args: Array<String>) {

    val superman=SuperHero("clark","kent")

    println("Superman is $superman")

    println("Superman hashcode is ${superman.hashCode()}")

    val supermanAlias=SuperHero("clark","kent")

    val areTheyEqual=superman.equals(supermanAlias)
    println("Is superman equals supermanAlias? $areTheyEqual")

    val isFirstName=superman.firstname.equals(superman.component1())
    println("is .firstName equal to .component1? $isFirstName ")

    val isLastName = superman.lastName.equals(superman.component2())
    println("is .lastName equals to .component2? $isLastName")

    val hero={x:SuperHero->x}
    val(firstName,lastName)=hero(superman)
    println("Our superhero name is $firstName $lastName")

    //another sample of multi declarations
    fun supercharge(x : SuperHero) : SuperHero {
        val m = SuperHero(x.firstname.toUpperCase(), x.lastName.toUpperCase())
        return m
    }

    val(firstName2, lastName2) = supercharge(superman)
    println("Our supercharged superhero name is $firstName2 $lastName2")
}