package oops.abstraction

open class Shapes{
    open fun draw(){

    }
}


abstract class Abstract : Shapes() {
    abstract override fun draw()
}

class Polygon:Abstract(){
    override fun draw() {
        println("Hello world")
    }

}

fun main(){
    val obj:Polygon = Polygon()
    obj.draw()
}