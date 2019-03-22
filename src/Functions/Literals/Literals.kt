package Functions.Literals

fun main(args: Array<String>) {

    // this is how to declare it and assign it to a value -
    // since the type is specified, you can omit the type declaration in
    // the implementation
    val literal:(String)->Unit={ println(it)}
    literal("This will be printed")

    // A statement literal - notice you have to declare the type of the parameter
    val literal2={x:String-> println(x.toUpperCase())}
    literal2("This is all uppercase now")

    // A function literal - notice you have to declare the type of the parameter
    // but you can omit the return type
    val literal3={ x:String->x.toLowerCase()}
    val lowercases=literal3("THIS IS ALL LOWERCASE NOW")
    println(lowercases)

    // A function literal that uses multiple lines
    val literal4={
        x:String->
        val y="Multiple lines: $x"
        y// you have to put the variable to be returned since
        // return keyword is not allowed here
    }

    val text=literal4("What a wonderful world")
    println(text)

    fun show(p:(String)->Unit){
        p("This is a function literal")
    }

    show { x-> println(x)}

    fun show2(p:()->Unit){
        p()
    }

    //and if the last parameter of a function is a parameter, you can pass it outside ()
    show2 { println("This is a function literal without a parameter") }
}