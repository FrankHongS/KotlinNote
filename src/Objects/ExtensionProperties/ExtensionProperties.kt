package Objects.ExtensionProperties

val Amazing.isEmpty: Boolean
    get() = this.name.isEmpty()

class Amazing(val name: String)

fun main(args: Array<String>) {
    val italian=Amazing("Roberto")

    println("${italian.name} is empty: ${italian.isEmpty}")
}