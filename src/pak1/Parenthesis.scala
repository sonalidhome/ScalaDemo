package pak1


object Parenthesis {
  
  def main(args:Array[String])
  {
    var ls         =  List('a','b','c');
    
    var str:String =  "(Hello)!";
    var strLst  = new Cons('(',new Cons(')',new Cons('3',new Nil)))
    
    println(strLst.isEmpty)
    println("Output : "+ balance(strLst))
  }
  
 def balance(chars: List[Char]): Boolean = {
    def balanced(chars: List[Char], open: Int): Boolean = 
      if (chars.isEmpty) open == 0
      else if (chars.head == '(') balanced(chars.tail,open+1)
      else if (chars.head == ')') open>0 && balanced(chars.tail,open-1)
      else balanced(chars.tail,open)
    balanced(chars,0)
}
}