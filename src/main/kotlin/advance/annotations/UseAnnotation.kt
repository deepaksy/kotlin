package advance.annotations



@Annotation("example")class UseAnnotation{
    @Annotation("example")fun baz( @Annotation("example")foo:Int):Int{
        return (@Annotation("example")1)
    }
}


fun main(){
    val i:UseAnnotation = UseAnnotation()
    println(i.baz(2))
}