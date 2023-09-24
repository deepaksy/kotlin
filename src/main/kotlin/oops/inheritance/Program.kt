package oops.inheritance

abstract  class Base() {
    init {
        println("Base constructor initialized")
    }
    fun greet(){
        println("Hello From base")
    }
  abstract fun add(a:Int, b:Int):Int
}

class Derived:Base(){
    override fun add(a: Int, b: Int): Int {
        return a+b
    }

}

fun main(){
    val obj:Derived =  Derived()
    println(obj.add(2,3))
}