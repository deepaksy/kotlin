package collection
fun main(){
    val fruits: MutableList<String> = mutableListOf("Apple", "Papaya","Banana","Guava","Dragon fruit","Grapes")
    val fruitsLocked : List<String> = fruits
    println(fruitsLocked)
}