package Objects.ObjectClass

fun main(args: Array<String>) {

    val espana=Matador("Emilio")

    Matador.show(espana)

    val m=Matador
    println("Typeof "+m)
    m.show(espana)

}

class Matador(private val name: String){

    private fun myPrivateShow(){
        println("This is $name private show")
    }

    companion object {
        fun show(mt:Matador){
            // function inside a class object can access private properties and function of
            // the class
            println("Expose the private secret of ${mt.name}")
            mt.myPrivateShow()
        }
    }

}