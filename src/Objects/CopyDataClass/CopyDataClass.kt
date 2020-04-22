package Objects.CopyDataClass

data class Person(val firstName:String,val lastName:String){
    public fun print(){
        println("$firstName $lastName")
    }
}

fun main(args: Array<String>) {
    val president1=Person("Bill","Clinton")
    president1.print()

    val president2=president1.copy(firstName = "Hillary")
    president2.print()
}