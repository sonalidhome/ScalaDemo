

abstract class  absIterator
{
  type T;
  def hasNext :Boolean
  def next:T
}

trait richIterator extends absIterator
{
  def foreach(f:T=>Unit){while (hasNext) f(next)}
}

class StringIterator(s:String) extends absIterator with richIterator
{
  type T=Char;
  private var i=0;
  def hasNext = i<s.length
  def next = {val ch = s charAt i; i=i+1; ch}
}



object MixinTest {
  def main(args:Array[String])
  {
    var t = new StringIterator("Sonali");
    t foreach println
  }
}