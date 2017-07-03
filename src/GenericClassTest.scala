object GenericClassTest{
  def main(args:Array[String])
  {
    var obj = new GenericClassTest[Int]
    var ls = List(1,2,3,4,5)//("a","b","c","d")
    obj.setLs(ls);
    obj.show()
  }
}

class GenericClassTest[T] {
  
  var ls:List[T]=Nil;
 
  def setLs(t:List[T])
  {
    ls=t  
  }
  def show()
  {
    println(ls)
  }
}