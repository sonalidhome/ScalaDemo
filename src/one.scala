object one {
  def main(args: Array[String])
  {
    println("Hello")
    var a = new one(1,"sonali");
    println(a);
    a.setDetails();
    println(a);
    a.setDetails(202);
    println(a);
    a.sum(1, 1.0);
  }
}

class one(id:Int,name:String) 
{
  var rollNo:Int=101
  override def toString():String={
   "Id : "+id+" \tName : "+name+" \t Roll No :"+rollNo;
  }
  
  def setDetails(rollNo:Int){
    this.rollNo = rollNo;
  }
  
  def setDetails(){
    this.rollNo = 0
  }
  
  def sum(a:Int,b:Int)
  {
    println("Result Int "+ (a+b));
  }
  
  def sum(a:Double,b:Double)
  {
    println("Result Double "+ (a+b));
  }
}