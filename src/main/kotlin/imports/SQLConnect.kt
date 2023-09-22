package imports


import java.sql.*

fun main(){
    val conn:Connection
    val statement:Statement
    val result:ResultSet
    try{
        val query = "select * from students"
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root")
        statement = conn.createStatement()
        result = statement.executeQuery(query)
        while(result.next()){
            val sid:String = result.getString("sid")
            val firstname:String = result.getString("firstname")
            val lastname:String = result.getString("lastname")
            println("Student ID: $sid\nName: $firstname $lastname")
        }
    }
    catch (e:SQLException){
        println(e)
    }

}
