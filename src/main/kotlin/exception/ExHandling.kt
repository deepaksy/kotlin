@file:Suppress("DIVISION_BY_ZERO")

package exception

fun main(){
    try{
        val result = 3/0
        println("Result : $result")
    }
    catch (e: Exception){
        println("Cannot Divide by zero:\nDetailed error: $e")
    }
}