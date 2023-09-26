package advance

import java.util.LinkedList


fun lists():List<String>{
    val lists:LinkedList<String> = LinkedList<String>()
    lists.add("A")
    lists.add("B")
    lists.add("V")
    lists.add("C")
    lists.add("D")
    lists.add("E")
    return lists
}

fun main(){
    val list:List<String> = lists()
    val item: Iterator<String> = list.iterator()
    for(i in item){
        println(i)
    }
}