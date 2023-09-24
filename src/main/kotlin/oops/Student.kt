package oops

data class Student(val name:String,val age:Int, val id:Int){

    init {
        println("Init method called...")
    }

    constructor(name:String,age:Int, id:Int,  bg:Char) : this(name,age,id) {
        println("Constructor called!!!")
    }
}

fun main(){
    val s:Student = Student("Deepak",23,1,'B')
    println(s.toString())
}