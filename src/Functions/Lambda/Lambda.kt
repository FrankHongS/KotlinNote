package Functions.Lambda

fun main(args: Array<String>) {
    val xline:(String)->String={y:String->"Full $y"}
    println("Full format function literal '${xline("Moon")}'")

    val xline2:(String)->String={y->"Short $y"}
    println("Shortened format function literal '${xline2("Sticks")}'")

    doMore(xline2)
    doMore{y->"Literal Function $y"}

    doMore({
        y->
        val m="$y multiline"
        m
    })

    doCaculation {
        y->
        val m=y+10
         m
    }
}

fun doMore(doSomething:(String)->String){
    println("This is from passed function '${doSomething("Great")}'")
}

fun doCaculation(calc:(Int)->Int){
    println("This is the result ${calc(10)}")
}