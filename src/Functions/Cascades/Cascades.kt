package Functions.Cascades

fun main(args: Array<String>) {
    var superman=Superman().with {
        name="Lux Luthor"
        punch()
        kick()
        sidekick=Spiderman().with {
            special()
        }
    }
}

// 定义中缀扩展方法
public infix fun <T> T.with(operations:T.()->Unit):T{
    operations()
    return this
}

public class Superman(){
    var name:String="Clark Kent"
    var sidekick:Sidekick=Robin()

    public fun punch():Unit= println("${name} punches")
    public fun fly():Unit= println("${name} flies")
    public fun kick():Unit= println("${name} kicks")

}

interface Sidekick{
    fun special()
}

public class Spiderman():Sidekick{
    var name:String="Peter Parker"
    override fun special() {
        println("${name} webs")
    }
}

public class Robin():Sidekick{
    var name:String="Robin"
    override fun special() {
        println("${name} is useless")
    }
}