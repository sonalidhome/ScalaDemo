
object InnerClassesTest {
 def main(args: Array[String]): Unit = {
  var obj = new Outer
  
  obj.in.show
  obj.in.show
  obj.in.show
  obj.in.show
  obj.show
  obj.showCont
 }
}

class Outer{
  var out:String="Out Side"
  def show {println(out)}
  var count:Int=0;
  println("Constuctor Count "+count)
  
  class Inner{
    count=count+1;
    var inner:String="Inner Side"
    def show {println(inner)}
  }
  
  var in:Inner = new Inner();
  
  def showCont{println("count "+count)}
}