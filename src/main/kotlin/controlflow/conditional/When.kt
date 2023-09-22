package controlflow.conditional

import kotlin.system.exitProcess

fun main() {
    println("choices: \n1. Greet user\n2. Greet computer\n 3. Exit")
    print(" Enter your choice")
    val choice = readln()
    val result = when(choice){
         "3" -> {
             println("3 is chosen")
             exitProcess(0)
         }
         "1" -> {
             println("Hello User")
         }
         "2" -> {
             println("Hello computer")
         }
        else -> {
            "Unknown"
        }
    }
    println(result)
}