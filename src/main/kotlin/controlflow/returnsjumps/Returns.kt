package controlflow.returnsjumps

fun main(){
    checkpoint@ for ( i in  1..10){
        if(i%2==0){
            continue@checkpoint
        }
        println(i)
    }
}