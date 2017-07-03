
import scala.collection.immutable.Queue;

object SeqTest {
  
  def main(args:Array[String])
  {
      funStream();
  }
  
  def funSeq()
  {
    try{
      var s = Seq("a","z","w",1)
      println(s.forall(x=>x.isInstanceOf[String]))
    }
    catch {
      case e:IndexOutOfBoundsException => println("Index is invalid ");   
    }
    println("ok")
  }
  
  def funVector()
  {
    var s = Vector(4.isNaN(),5,'a',"a")
    println(s)
    
    var s2:Vector[Any] = Vector(1,2,"a",'a')
    println(s2)
    
    var s3 = Vector.empty
    var s4= s3:+"z":+"y"
    var s5 = s3++s4
    println(s5.sorted)
    
  }
  
  def funQueue()
  {
    var q = Queue(9,8,7,6,5,4,3)
    println(q)    
    var q1 = q.dequeue
    println(q1)
  }
  
  def funStream()
  {
    var str = Stream(1,2,3,4,5)
    str = 100#::200#::300#::Stream.empty
    println(str.take(300))
  }
}
