package collection

fun main() {
    var cond:Boolean = true
    var count:Int = 0
    while(cond){
        println(count)
        count++
        if(count>1000000)cond=false
    }
}