
object PatternPrint extends App{
  
  var t= new PatternPrint();
  t.lowerTringle(5);
}


class PatternPrint {
  
  
  def lowerTringle(number:Int)={
    var j=1;
   def myPrint(i:Int):Unit={
     println("j="+j+" i="+i+ " number="+ number)
     
     if(i<j)
         {
           print("* ")
           myPrint(i.+(1))
         }
       
     if(i==j)
       {
         j.+(1)
         println(" ")
       }
     
   }
    myPrint(0)
  }
  
}