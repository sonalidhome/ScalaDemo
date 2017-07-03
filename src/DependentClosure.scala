

object DependentClosure extends App {
  
  def whileLoop(cond: => Boolean)(body: => Unit):Unit=
    if(cond)
    {
      body
      whileLoop(cond)(body)
    }
  var i=10
  whileLoop(i>0){
  print(i+" ")
  i=i-1
  }
}