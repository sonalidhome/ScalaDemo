

object currying {
  
  def main(args:Array[String]){
    println("Sum"+ sum(id)(1,3));
    println("factorial"+ fact(4));
    }
  
  def sum(f:Int=>Int)(a:Int,b:Int) :Int = {
    
    def sumf(a:Int,b:Int):Int={
    if(a>b)
      1
    else 
      f(a)* sumf(a+1,b)
    }
    
    sumf(a,b)
  }
  
  def fact(n:Int):Int = sum(x=>x)(1,n)
  
  def id(a:Int):Int={
    a}
}