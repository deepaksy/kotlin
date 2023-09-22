package functions


/**
 *
 */

fun usageexample(){
    val numbers = listOf(1,3,-2,-4,5,-6)
    val positives = numbers.filter { x -> x > 0}
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)
    println(negatives)
}

fun main() {
    println({string:String ->string.uppercase()}("hello"))
    usageexample()
}