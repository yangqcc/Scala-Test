package functionscala.chapter3

sealed trait List[+A]

case object Nil extends List[Nothing]

case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {

  def sum(ints: List[Int]): Int = ints match { //利用模式匹配对一个整数型List进行合计
    case Nil => 0   //空列表的累加值为0
    case Cons(x, xs) => x + sum(xs)  //对一个头部是x的列表进行累加,这个过程是用x加上该列表的剩余部分的累加值
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
}

class MyList {

}
