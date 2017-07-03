
abstract class  Bank(id:Int) {
  var b=10;
  var c=20;
  private val rateOfIntrest =0;
  def show(){print("Basic")};
}

class ICICI(id:Int) extends Bank(id)
{
  b=101
  c=102
   val rateOfIntrest =8;
  override def show(){
    println("ICICI rate of instrest "+rateOfIntrest +" b "+b+" c"+c)
  }
}

class Axis(id:Int) extends Bank(id)
{
  b=201
  c=202
  
   val rateOfIntrest =7;
  override  def show(){
    println("Axis rate of instrest "+rateOfIntrest +" b "+b+" c"+c)
  }
}


class Citi(id:Int) extends Bank(id)
{
  b=301
  c=302
  
   val rateOfIntrest =6;
  override def show(){
    println("Citi rate of instrest "+rateOfIntrest +" b "+b+" c"+c)
  }
}


object Inheritance {

  def main(args:Array[String])
  {
    new ICICI(1).show();
    new Axis(2).show();
    new Citi(3).show();
  }
}
