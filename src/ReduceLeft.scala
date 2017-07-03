object ReduceLeft {
  def main(args:Array[String])
  {
    var s1= List("a","b","c")
    println(s1.reduceLeft(_+_))
    
     /*var l1 = List (1,2,3,4,5)
     var l2 = List (10,20,30,40,50)
     
     var r= l1.reduceLeft(_+_)
     println("Reduce Left"+r)
     
     var r1= l1.foldLeft(1)(_*_)
     println("Fold Left"+r1)
     
     var r3 = l2.reduceLeft((x,y)=> x min y)     
     println("Minimum of "+r3)
     
     val findMax = (x:Int,y:Int)=> x max y
     
     var r4= l2.reduceRight(findMax)     
     println("Maximum of "+r4)
     
     var r5 = l2.foldLeft(0)(findMax)
     println("FoldLeft Maximum of "+r5)
     */
  }
  
}