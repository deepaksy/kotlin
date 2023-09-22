package controlflow.loops

fun main(){
    var cond = true
    var count = 0
    while(cond){
        if(count > 100000){
            cond = false
        }
        count++
        println("Hello world")
    }
}