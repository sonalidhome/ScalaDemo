
object ImplicitDemo extends App{
  
  implicit def test(y:Int)= intExtension1(y);   
  println("Plus : "+1.subtract(4))  
}

case class intExtension1(value:Double)
{
  def plus(y:Int):Double = value+y;
  def subtract(y:Int):Double = value-y;
}

 class intExtension2(value2:Int)
{
  def plus(y:Int):Int = value2+y;
}