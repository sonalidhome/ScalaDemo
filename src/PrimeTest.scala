

object PrimeTest extends App{
  
  println(isPrime(3))
  
  var sx = List(1,2,3,4)
  
  def isPrime(n:Int):Boolean = (2 until n) forall(d => n%d !=0)
  
  println(sx exists (x=>x%3==0))
 
}