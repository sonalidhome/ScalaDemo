
object Rational
{
  def main(args:Array[String])
  {
    var obj1 = new Rational(1,2);
    var obj2 = new Rational(3,2);
    println("+ : " +(obj1 + obj2))
    println("- : " +(obj1 - obj2))
    println("Unary - : " +(-obj2))
    println("* : " +(obj1 * obj2))
  }
}


class Rational(x:Int=0,y:Int=0) {
  var g = gcd(x,y);
  var numer:Int=x/g
  var denom:Int=y/g
  
  override def toString():String = numer+ "/"+ denom   
  def +(r2:Rational):Rational = {
    var n1= this.numer*r2.denom+r2.numer*this.denom;
    var n2= this.denom*r2.denom;
    new Rational(n1,n2)    
  }
  
  def -(r2:Rational):Rational = {
    var n1= this.numer*r2.denom-r2.numer*this.denom;
    var n2= this.denom*r2.denom;
    new Rational(n1,n2)    
  }
  
  def *(r2:Rational):Rational = {
    var n1= this.numer*r2.numer;
    var n2= this.denom*r2.denom;
    new Rational(n1,n2)    
  }
  
  
  def  unary_- ():Rational = {
    new Rational(-x,y)    
  }
  
  def gcd(a:Int, b:Int) :Int = if(b==0) a else gcd(b,a%b)
  
  
  
}