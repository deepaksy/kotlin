package functions

fun hello(user:String="Alex"):String{
    return "Hello $user"
}

// Single - expression functions

fun sum(x:Int, y:Int):Int = x+y

fun main() {
    val hello = hello("Deepak")
    println(hello)
    // Named Arguments
    println(hello(user="Kishan"))
    println(hello())
    println("Sum of 3 and 2: ${sum(3,2)}")
}