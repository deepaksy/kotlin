package oops.polymorphism

open class Person(name:String, age:Int, BloodGroup:String){
    init{
        println("Base Class: Person")
    }
}

class Dad(name:String, age:Int, BloodGroup:String):Person(name,age,BloodGroup) {
    fun parenting(){
        println("Dad is parenting!!!")
    }
}


fun main(){
    val daddy:Dad = Dad("Deepak",23,"A+")
    daddy.parenting()
}