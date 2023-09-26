package advance.destructuring


data class Result(val result: Int, val status: Boolean)


fun main(){
    val _result:Result = Result(100,true)
    val (result,status) = _result
    println("Result: $result")
    println("Status: $status")
}

