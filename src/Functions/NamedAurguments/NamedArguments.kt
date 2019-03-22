package Functions.NamedAurguments

fun superHeroCapabilities(
    name:String,
    fly:Boolean=false,
    swim:Boolean=false,
    punch:Boolean=true
){

    var output=""

    output += if (fly)
        "$name can fly"
    else
        "$name cannot fly"

    output += if(swim)
        ", can swim"
    else
        ", cannot swim"

    output += if(punch)
        " and can punch"
    else
        " and cannot punch"

    println(output)
}

fun main(args: Array<String>) {
    val batman= superHeroCapabilities(name = "Batman")
    val superman= superHeroCapabilities(name = "Superman",fly = true)
    val hulk= superHeroCapabilities(name = "Hulk",punch = true)
}