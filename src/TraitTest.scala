

object TraitTest {
  def main(args:Array[String])
  {
    new me1().show;
  }
}


trait me
{
var x:Int =0;  
def show(){println(x)}
}

class me1 extends me
{
  
}