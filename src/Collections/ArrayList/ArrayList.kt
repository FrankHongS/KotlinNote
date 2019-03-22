package Collections.ArrayList

import java.util.function.Consumer

fun main(args: Array<String>) {
    val list= arrayListOf(1,2,3)
    list.forEach{ println(it)}

    val list2= arrayListOf(Pair("Chandler","Bing"),
        Pair("Reachel","Green"),
        Pair("Joey","Tribiani")
    )

    list2.add(Pair("Hillary","Clinton"))

    list2.forEach{ println("${it.first} - ${it.second}") }
}