

object RegExpTest {
  def main(args:Array[String])
  {
    def contains(x:String):Boolean ={
      val z:Seq[Char]= x
      z match {
      case Seq('s','c','a','l','a',rest @_*) => println("Rest :"+rest);true
      case Seq(_*)=>false
      } 
    }
    
    println(contains("*scala*"))
  }
}