

sealed trait MyList[+A]

case object MyNil extends MyList[Nothing]

case class MyCons[+A](head:A,tail:MyList[A]) extends MyList[A]


object MyListDemo extends App{
  
  
  def sum(inst:MyList[Int]):Int= inst match
  {
    case MyNil => 0
    case MyCons(x,xs)=> x+ sum(xs)
  }
  
  println(sum(new MyCons(2,new MyCons(6,new MyCons(0,MyNil)))));
  
  val x = (new MyCons(2,new MyCons(6,new MyCons(0,MyNil)))) 
  match {
  case  (MyCons(x, MyCons(6, MyCons(10, MyNil)))) => x
  case (MyCons(_,MyNil)) => 42
  case MyCons(x, MyCons(y, MyCons(3, MyCons(4, _)))) =>x+y
  case MyCons(h, t) => h + sum(t); println("MyCons(h, t)")
  case _ => 101
  }
  
  println("case result : "+x)
  
  def tail[A](li:MyList[A]):MyList[A] = li match {
    case MyNil => MyNil
    case MyCons(_,t) => t
  }
  
  println(tail(new MyCons(6,new MyCons(0,MyNil))))
  
  def setHead[A](x:A,li:MyList[A]) = li match {
    case MyNil => sys.error("List is empty")
    case MyCons(_,t) => MyCons(x,t)
  }
  
  println(setHead(2,new MyCons(6,new MyCons(0,MyNil))))
  //println(setHead(2,MyNil))
  
  
  def drop[A](l: MyList[A], n: Int): MyList[A] = {
    if(n==0) l
    else
    {
      l match {
      case MyNil =>  MyNil 
      case MyCons(_,t) =>  drop(t,n-1)
      }
    }
  }
  
  println("Drop "+ drop(new MyCons(6,new MyCons(0,MyNil)),4))
  
  def dropWhile[A](l: MyList[A], f: A => Boolean): MyList[A]=
    l match 
  {
    case MyCons(h,t) if(!f(h)) => dropWhile(t,f)
    case _ => l
  }
  
  println("Drop While "+ dropWhile(new MyCons(6,new MyCons(0,MyNil)),(x:Int)=>x==0))
  
  def appendList[A](a1:MyList[A],a2:MyList[A]):MyList[A]=
    a1 match
  {
    case MyNil => a2
    case MyCons(h,t) => MyCons(h,appendList(t,a2))
  }
  
  println("Append List "+ appendList(new MyCons(6,new MyCons(0,MyNil)),new MyCons(120,new MyCons(15,MyNil))))
  
  
  def init[A](ls:MyList[A]):MyList[A]= ls    match
  {
    case MyNil => MyNil
    case MyCons(_,MyNil) => MyNil
    case MyCons(h,t) => MyCons(h,init(t))  
  }
  
  println("InIt "+ init(appendList(new MyCons(6,new MyCons(0,MyNil)),new MyCons(120,new MyCons(15,MyNil)))))
  
  
  def foldRight[A,B](as: MyList[A], z: B)(f: (A, B) => B): B =
    as match {
    case MyNil => z
    case MyCons(x, xs) => f(x, foldRight(xs, z)(f))
    }
  
  println("fold right "+ foldRight(new MyCons(6,new MyCons(0,new MyCons(120,new MyCons(15,MyNil)))),4)((x,y)=> x+y))
  
  
}