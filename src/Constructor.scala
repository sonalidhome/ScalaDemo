

object Contructor{
  
  def main(args:Array[String])
  {
    println(new Constructor(1));
  }
  
}

class Constructor {
  
  var id:Int=0;
  println("defaultly added in contructor with Id "+id)
  
  def this(id1:Int)
  {
    this();
    this.id = id1;
  }
  
  override def toString:String={
    "Id is :"+id;
  }
}