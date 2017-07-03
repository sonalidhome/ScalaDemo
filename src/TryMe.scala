import scala.beans.BeanProperty


object TryMe extends App{
  var x = 10;
  println(s"Hello %.16f $x");
  
  val o = new Object();
  val a = new AnyRef();
  //o = a
  if(o==a)
    println("EQL")
  println(o+" : "+a);

  
  val iList = List(2, 7, 9, 8, 10);
  val iDoubled = iList.filter(_ % 2 == 0).map(x=>x)
  iDoubled.foreach(x=>println(x))

  
  /*
  var temp = new ConstructorDemo("Sonali");
  temp.name="s"
  println(temp.name)
  
  var pojo = new POJO("A");
  println(pojo.getName())
  pojo.setName("B")
  println(pojo.getName())*/
  
}

class ConstructorDemo(var _name:String)
{
  def name_=(_name:String)= {this._name=_name};
  def name:String = this._name;
  
  override def toString()=" Name : "+name
}

class POJO(@BeanProperty var name:String)
{
  
}