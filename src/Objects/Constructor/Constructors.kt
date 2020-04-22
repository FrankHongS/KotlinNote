package Objects.Constructor

class Primary(initialName:String,age:Int=30){
    var firstName=initialName
    val age=age

    init {
        firstName+=".jr"
    }

    public fun sayName(){
        println("My name is $firstName and I am $age years old")
    }
}

fun main(args: Array<String>) {
    val p=Primary("John Adams",56)
    p.sayName()

    val n=Primary("Bon Jovi")
    n.sayName()
}