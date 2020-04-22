package Objects.PairAndTriple

fun main(args: Array<String>) {
    val greet=Pair("Hello","World")

    val(word1,word2)=greet

    println("${greet.first} ${greet.second} or $word1 $word2")

    val greet2=Triple("I","am",34)
    val(word3,word4,word5)=greet2

    println("${greet2.first} ${greet2.second} ${greet2.third} or $word3 $word4 $word5")

    val greet3="Hello" to "World2"
    println("${greet3.first} ${greet3.second}")
}