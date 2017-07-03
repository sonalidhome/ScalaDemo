object FunctionsTest {
  
  def main(args:Array[String])
  {
     println(product(id,1,2))
  }
 
  def product(f:Int=>Int,x:Int,y:Int):Int={
    if(x>y) 0 
    else
      f(x)+product(id,x+1,y)
  }
  
  def id(a:Int):Int= a
  
  val t =(x:Int,y:Int) => x+y
  
  val paraEnd = () => ("End of Paragraph")
  
  var multiply1 = (x:Int,y:Int) => x*y;
  
  def test(){
    try{
          var t1 = t(4,4)
          println("Result "+t1)
          
          var t2 = new Function[Int,Int]{
          def apply(x:Int):Int =x+1
          }
          
          println("Result "+t2(2))
          
          var prod = multiply1(3,4)
          println("Multiplication "+prod)
        
        println(paraEnd())
      }
      catch{
        case e : Exception =>println(e)
      }   
  }
}