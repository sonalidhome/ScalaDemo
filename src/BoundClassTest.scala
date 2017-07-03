

object BoundClassTest {
  
  
  def main(args: Array[String]): Unit = {
    
  var c = new Cage[Animal](new Animal)
  
  var t = new Cage[Pet](new Pet)
    
  }
  
}

class Animal{
  def name:String = "Animal"
}

class Pet extends Animal
{
  override def name:String = "Pet"
}

class Dog extends Pet
{
  override def name:String = "Dog"
}

class Cat extends Pet
{
  override def name:String = "Cat"
}

class Lion extends Animal
{
  override def name:String = "Lion"
}

class Cage[P>:Pet](p:P){
  def per:P = p
  println(per)    
}

