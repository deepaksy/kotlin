package oops.polymorphism

open class Person(name:String, age:Int, BloodGroup:String){
    init{
        println("Base Class: Person")
    }

    open fun walking(){
        println("Person is walking.....")
    }
}

class Dad(name:String, age:Int, BloodGroup:String):Person(name,age,BloodGroup) {
    fun parenting(){
        println("Dad is parenting!!!")
    }

    override fun walking(){
        println("Dad is walking.....")
    }
}


fun main(){
    val daddy:Dad = Dad("Deepak",23,"A+")
    daddy.parenting()
    daddy.walking()
}