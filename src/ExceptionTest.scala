
object ExceptionTest{
  def main(args:Array[String])
  {
    fun
  }
  
  def fun():Any=
  {
    try{
    throw new ExceptionTest("Divide by Zero");
    
    }
    catch
    {
      case e3 : ExceptionTest=> println("Chlid "+ e3)
      case e1 : Throwable => println("throwable "+e1.toString)
      case e2 : Exception => println("Exception "+e2.toString)
      
    }
    finally{
      println("Will always execute");
    }
    
  }
}

class ExceptionTest(s:String) extends Exception(s){}