
object HigherOrderFunctions extends App {
  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
   
  }
  
  println(formatResult("absolute value", -42, Math.abs))
  
  println(formatResult("factorial value", 5, factorial))
  
  def factorial(n:Int):Int={
   if(n<1)  1
   else
     n*factorial(n-1)
  }
  
  println("Is Sorted Array? "+new H1().isSorted(Array(1,2,3,4),(x:Int,y:Int)=>y>x))
  println("Currying : " +new H1().curry((x:Int,y:Int)=>x-y==1))
  println("Un-Currying : " +new H1().uncurry(Nil))
}

class H1
{
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean =
      if (n == as.length - 1) ordered(as(n-1), as(n))
      else if (! ordered(as(n-1), as(n))) false
      else go(n + 1)
    if (as.size == 0 || as.size == 1) true
    else go(1)  
  }
  
  
  def curry[A,B,C](f: (A, B) => C): A => (B => C) =   a => b => f(a, b)
  
  def uncurry[A,B,C](f: A => B => C): (A, B) => C  =  (a,b)=> f(a)(b)

}