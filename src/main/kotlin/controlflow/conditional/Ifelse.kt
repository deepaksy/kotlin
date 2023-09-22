package controlflow.conditional

fun main() {
    val d:Int
    val check:Boolean = true
    d = if (check) {
        1
    }
    else{
        2
    }

    println(d)
}