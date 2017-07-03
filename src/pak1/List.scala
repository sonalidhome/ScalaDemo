package pak1

trait  List[T] {
 
  def isEmpty:Boolean
  def head:T
  def tail:List[T]
} 

class Cons[T](val head:T,val tail:List[T]) extends List[T]{
  def isEmpty = false
  
}

class Nil[T] extends List[T]{
  def isEmpty = true
  def head:Nothing = throw new NoSuchElementException("Error in head");
  def tail:Nothing  = throw new NoSuchElementException("Error in tail");
}

object Nth{
  def nth[T](n:Int,xs:List[T]) :T= 
    if(xs.isEmpty) throw new IndexOutOfBoundsException()
    else if (n==0) xs.head
    else nth(n-1,xs.tail)
      
}

object Test
{
  def main(args:Array[String])
  {
    var list = new Cons(1,new Cons(2,new Cons(3,new Nil)))
    Nth.nth(-1,list)
    println(list)
  }
}
