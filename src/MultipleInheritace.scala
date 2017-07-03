object MultipleInheritace {
  def main(args:Array[String])
  {
    var c = new c() with d;
    c.show()
  }
}

trait a{ println("Class A")}

class b extends a{ println("Class B")}

class c extends b with a {
  println("Class C")
}

trait d {
  def show(){ println("In class D")}
}