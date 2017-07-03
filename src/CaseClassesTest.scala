
trait  vehical
{
  def drive(){println("Vehical Driving")}
}

case class twoWheel() extends vehical{
  override def drive(){println("Two Wheeler is Riding")}  
}

case class threeWheel() extends vehical{
  override def drive(){println("Three Wheeler is Riding")}  
}

case class fourWheel() extends vehical{
  override def drive(){println("Four Wheeler is Riding")}  
}

case class oneWheel() extends vehical
{
  override def drive(){println("One Wheeler is Riding")}
}

object CaseClassesTest {
  
  def main(args:Array[String])
  {
    var t:vehical=null;
    t= new oneWheel();
    t match{
      case twoWheel() => println(1)
      case threeWheel() => println(2)
      case fourWheel() => println(3)
      case oneWheel() => println(5)
      case _ => println("None")
      
    }
    
  }
  
}