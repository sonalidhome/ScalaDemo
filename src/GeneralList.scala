object GeneralList {
   
  def main(args:Array[String])
  {
    var ls = List(1,2,3,4) ::: List(3,4,5,6)
    var l1= List(10,20,30)
    var l2 = List(100,200,300)
    println(ls.contains(56))
    println(remove(2,ls))
    println(concat(l1,l2))
    println("SUM "+sum(l1))
    println( "abc" :: List(3,4,5,6))
  }
  
  def remove(n:Int, l:List[Int])= l.take(n) ::: l.drop(n+1)

  def concat(l1:List[Int],l2:List[Int]):List[Int] = l1:::l2
  
  def sum(xs:List[Int]) = (0::xs) reduceLeft((x,y)=> x+y)
  
  def product(xs:List[Int]) = (1::xs) reduceLeft((x,y)=> x*y)
  
 /* def concat1[T](xs:List[T],ys:List[T]):List[T]=
    (xs reduceLeft yx) (_::_)*/
  
}

