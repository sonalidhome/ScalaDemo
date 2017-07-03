

object Point1{
  
  def main(args:Array[String])
  {
    var pt = new Point();
    pt.x=10000
    pt.y=3434
    pt.z=10
  }
  
}

class Point {
  private var _x = 0;
  private var _y = 0;
  private val bounds = 100;
  var _z = 0;
  
  def z = _z;
  
  def z_= (newValue:Int){
    println("Z "+newValue)
  }
  
  def x = _x;
  
  def x_= (newValue:Int) :Unit = {
    if(newValue<bounds) _x=newValue else printWarning
    
  }
  
  def y = _y;
  def y_= (newValue:Int) :Unit = {
    if(newValue<bounds) _y=newValue else printWarning
    
  }
  
  def printWarning = println("Out of Bounds");
  
  def tt(a:Int):Unit = print(a+" B "+ bounds)
  
}