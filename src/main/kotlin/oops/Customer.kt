package oops

data class Customer(val id:Int, var name:String)

fun main() {
    val customer:Customer = Customer(1,"Deepak")
    println("ID: ${customer.id}\nName: ${customer.name}")
    println(customer.toString())
}