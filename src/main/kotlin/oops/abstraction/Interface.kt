package oops.abstraction

interface Math{
    val a:Int
    val b:Int
    fun add(a:Int,b:Int):Int
    fun add(a:Double,b:Double):Double
    fun sub(a:Int,b:Int):Int
    fun sub(a:Double,b:Double):Double
    fun multiply(a:Int,b:Int):Int
    fun multiply(a:Double,b:Double):Double
    fun foo(){
        println("Foo function")
    }
}

class Mathematics: Math{
    override val a: Int
        get() = 1
    override val b: Int
        get() = 2

    override fun add(a: Int, b: Int): Int {
        return a+b
    }

    override fun add(a: Double, b: Double): Double {
        return a+b
    }

    override fun sub(a: Int, b: Int): Int {
        var A:Int = a;
        var B:Int = b;
        if(B>A){
            B=a;
            A=b;
        }
        var sum:Int = A+B;
        return sum
    }

    override fun sub(a: Double, b: Double): Double {
        var A:Double = a;
        var B:Double = b;
        if(B>A){
            B=a;
            A=b;
        }
        var sum:Double = A+B;
        return sum
    }

    override fun multiply(a: Int, b: Int): Int {
        return a*b
    }

    override fun multiply(a: Double, b: Double): Double {
        return a*b
    }

}

fun main(){
    val obj:Mathematics = Mathematics()
    obj.foo()
    println(obj.add(2.2,3.2))
}