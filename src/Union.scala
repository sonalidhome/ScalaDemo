

class Union {
  
}

abstract class Inset{
  def include(temp : Int):Inset
  def contains(temp : Inset):Boolean
  def union(temp:Inset):Inset
}