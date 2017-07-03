

object Snippet extends App{
  
  
  def echo(args:String*)= for(arg<-args) println(arg)
  echo("Hello")
  println("---------------------------")
  echo("Hello", "World")
  println("---------------------------")
  echo("Hello","World","This")
  println("---------------------------")
  echo("Hello","World","This","Repeated Paramaters example")
  
}