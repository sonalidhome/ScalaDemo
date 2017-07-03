

object PascalTringle {
  
  def main(args:Array[String])
  {
    println("In Pascal")
    for(r<- 0 to 5){
      print(String.format("%"+(5-r+1)+"s"," "));
      for(c<- 0 to r)
        print(pascal(c,r)+" ")
      println("")
    }
    
  }
  
  def pascal(c:Int,r:Int):Int={
    if(c==r || c==0) 1 
    else
      pascal(c-1,r-1)+ pascal(c,r-1)
  }
}

