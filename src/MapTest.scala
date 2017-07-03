

object MapTest {
  def main(args: Array[String]){
    funMap()
    
    var a = Array(2,3,'a',"r")
    print(a.toString)
  }
  
  def funMap()
  {
    var m = Map(("Key","Value"),1->2)
    println(m)
    for((key,value)<- m)
    {
      println(key+"-"+value)
      
      
    }
    
  }
}