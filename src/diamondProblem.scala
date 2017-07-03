
object diamondProblem extends App{
  
  println(new test1().op)
  println(new test2().op)
}
trait base
{
  def op:String;
}

trait foo1 extends base
{
 override def op ="foo1"; 
}

trait foo2 extends base
{
 override def op ="foo2"; 
}

class test1 extends foo1 with foo2
class test2 extends foo2 with foo1


