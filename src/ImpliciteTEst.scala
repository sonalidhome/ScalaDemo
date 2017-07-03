object ImpliciteTEst{
  
  def main(args:Array[String])
  {
    var obj =  new ImpliciteTEst(3,4)
    
    implicit var x:Int=3;
    implicit var y:Int=4;
  
    obj.showDetails();
    obj.showDetails();
  }
}

class ImpliciteTEst(a:Int,b:Int) {
  
  var x:Int=a;
  var y:Int=b;
  
  def modify(implicit x:Int,y:Int)
  {
    this.x=x;
    this.y=y;
  }
  
  def showDetails()
  {
    println("X : "+x+" Y: "+y)
  }  
  
}