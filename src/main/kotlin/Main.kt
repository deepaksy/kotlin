fun main(args: Array<String>) {
    val neverNull:String="Never nullable string"
    var nullable:String?=null
    nullable = "Nullable String"
    println(neverNull)
    println(nullable)
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
}