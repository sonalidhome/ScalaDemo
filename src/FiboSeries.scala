

object FiboSeries extends App{
  
  def fib_recur(n: Int): Int = {
  n match {
    case i if i < 2 => i
    case i => fib_recur(n-1) + fib_recur(n-2)
  }
  }
  
  for(i<-0 to 15)
  {
    print(fib_recur(i)+" ")
  }
  
}