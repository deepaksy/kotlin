package variables

val popcorn = 5
val hotdog = 7
var customer = 10

fun main(){
    customer = 19
    println(customer)
    stringTemplates()
}

fun stringTemplates(){
    val str = "There are $customer customers."
    println(str)
}