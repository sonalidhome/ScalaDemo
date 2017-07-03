import java.io.PrintWriter
import java.io.FileWriter
import scala.io.Source
import java.io.File
import java.io.ObjectOutputStream
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream


object FileHandling {

  def main(Args:Array[String])
  {

    ObjectSerialize
    
  }
  
  def ObjectSerialize{
    
    try{
      var fp   = new File("src/EmpData.dmp")
      var in   = new ObjectOutputStream(new FileOutputStream("src/EmpData.dmp"));
      var out  = new ObjectInputStream(new FileInputStream("src/EmpData.dmp"));
      var emp1 = new Emp(1,"Sonali","IT")
      var emp2 = new Emp(2,"Sonali","Comp Sci")
      
     in.writeObject(emp1)
     in.writeObject(emp2)
     
     println("Objects writtern in file.")
     
     println("Object Retrieved")
     
     var t=out.readObject()
     
     /*while(( temp=out.readObject().isInstanceOf[Emp]))
     {
       println(temp)
     } 
     */
       
     
    }
    catch {
      case  e : Exception=> println(e)
      
    }
      
      
  }
  
  
  def simple()
  {
        /*try{
      var fp1 = Source.fromFile("src/adbc.txt");
      println(fp1)
    }
    catch
    {
      case e : Exception => None 
    }
    */
  /*  var fp1 = Source.fromFile("src/abc.txt").mkString;
    println(fp1)*/
    
    /*var d = fp1;
    for(ele <- fp1.getLines()){
      println(ele)}
    
    fp1.close();
    */
    
    var fp = new File("src/avc.txt")
    var prt = new FileWriter(fp,false)
    
     if(prt!=null)
     {
       println("file found")
       prt.write("q")
       prt.write("\t2")
       prt.write("\t3")
       
     }
    prt.close();
  }
  
}


class Emp(id:Int,name:String,dept:String) extends Serializable 
{
  override def toString():String= "Emp Id :"+id+" Name : "+name+" Dept : "+dept
}