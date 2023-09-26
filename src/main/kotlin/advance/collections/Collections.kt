package advance.collections

import java.util.ArrayList
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

fun arraylist():List<Int>{
    val list:ArrayList<Int> = ArrayList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    list.add(5)
    list.add(6)
    return list
}

fun main(){
    val list:List<String> = lists()
    val item: Iterator<String> = list.iterator()
    for(i in item){
        println(i)
    }
    val iter: Iterator<Int> = arraylist().iterator()
    while (iter.hasNext()){
        println(iter.next())
    }
}