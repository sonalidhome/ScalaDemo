import scala.collection.immutable.HashSet;
import scala.collection.immutable.BitSet;
import scala.collection.immutable.ListSet;

object CollectionTest{
  def main(args:Array[String])
  {
    var obj = new CollectionTest();
    //obj.testSet()
    //obj.hashSetExp();
    obj.ListSetExp();
   }
}

class CollectionTest {

  def ListSetExp()
  {
    var s = ListSet(4,52,4,7,2,4);
    println(s.toString)
    
    var l2:ListSet[String]= ListSet.empty;
    l2+="a"+"h"
    println(l2.toString)
  }

  
  def bitSetExp()
  {
    var s = BitSet(4,52,4,7,2,4);
    println(s.toString)
  }

    
  def hashSetExp()
  {
    var s = HashSet(2,3,5,6);
    println(s.toString)
    s=s-3
    println(s.toString)
    
  }
  
  def testSet()
  {
    var s1 = Set(1,2,3,4,5,'a')
    var s2 = Set(1,2,3,4,5,"a","B")
    println(s1.view)
  }
  
  def uniSet()
  {
    var s1 = Set(1,2,3,4,5,"a","C")
    var s2 = Set(1,2,3,4,5,"a","B")
    println("Union"+s1.union(s2))
    println("Intersect"+s1.intersect(s2))
    println("Exists : "+s1.count(x=>x.isInstanceOf[String]) )
  }
  
  def funs()
  {
    var s = Set(1,2,3,4,5,"a")
    println("Size "+s.size+" Contents : " + s)
    s+= 8  
    s-= 5;
    println(s.exists(x=>x.isInstanceOf[Char]))
    println("Size "+s.size+" Contents : " + s);
    s.foreach((t:Any) => println(t))
    for(w<-s)
      print("\t"+w)
  }
  
   def merg()
   {
    var s = Set("A","B","C","A",1,"1")
    var s1 = Set(101,102)
    var merge1 = s++s1 
    println("Size "+s.size+" Contents : " + s)
    println("Size "+s1.size+" Contents : " + s1)
    println("Size "+merge1.size+" Contents : " + merge1) 
   }
   
}