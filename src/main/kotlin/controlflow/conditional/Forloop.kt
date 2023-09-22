package controlflow.conditional


fun range(){
    for (i in 1..3){
        println(i)
    }
}

fun parselist(){
    val fruits: MutableList<String> = mutableListOf("Apple", "Papaya","Banana","Guava","Dragon fruit","Grapes")
    val fruitsLocked : List<String> = fruits
    for (i in fruitsLocked){
        print("$i ")
    }
}

fun main() {
    range()
    parselist()
}