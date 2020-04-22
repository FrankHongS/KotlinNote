package Loop

fun main(args: Array<String>) {

    val presidents= arrayOf("jfk","nixon","carter")

    println("I love these presidents")

    for(p in presidents){
      print("$p ,")
    }

    println()

    for (p in presidents.indices){
        print("${presidents[p]} ,")
    }

    println()

    var i=presidents.size
    while (i>0){
        i--
        print("${presidents[i]} ,")
    }

    println()

    var q=presidents.size
    do {
        q--
        print("${presidents[q]}, ")
    }while (q>0)

}