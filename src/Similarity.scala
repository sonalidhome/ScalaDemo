
trait Similarity {
  def isSimilar(x:Any):Boolean 
  def isNotSimilar(x:Any):Boolean = !isSimilar(x)
}

class Check(x:Int,y:Int) extends Similarity{
  
  var xs = x;
  var ys = y;
  
  override def isSimilar(p:Any):Boolean =
  {
    if(xs==p.asInstanceOf[Check].xs && ys==p.asInstanceOf[Check].ys )
      true
    else
      false
  }
}

object test
{
  def main(args:Array[String])
  {
    
    var t1 = new Check(1,1);
    var t2 = new Check(2,2);
    var t3 = new Check(1,1);
    
    println("t1.equal(t2)",t1.isSimilar(t2))
    println("t2.equal(t3)",t2.isSimilar(t3))
    println("t1.equal(t3)",t1.isSimilar(t3))
    
    println("!t1.equal(t2)",t1.isNotSimilar(t2))
    println("!t2.equal(t3)",t2.isNotSimilar(t3))
    println("!t1.equal(t3)",t1.isNotSimilar(t3))
    
  }
}


