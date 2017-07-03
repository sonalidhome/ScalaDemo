

object TestExpr {
  
  def show(e:Expr):String= e match{
    case Number(x)=> x.toString
    case Sum(l,r)=> show(l)+" + "+show(r)
    case Product(l,r)=> show(l)+" * "+show(r)
  }
  
  def main(args:Array[String])
  {
    println( show(Product(Number(1),Number(44))))
    println( show(Sum(Product(Number(1),Number(44)),Number(10))))
  }
}