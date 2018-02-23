/*
package chapter4

/**
  * Created by yangqc on 2018/2/17.
  */
sealed trait Option[+A]

case class Some[+A](get: A) extends Option[A]

case object None extends Option[Nothing]

object ExceptionHandler2 {

  /**
    * mean是一个完全函数,对每一个输入的值都有一个对应类型的输出类型的值
    *
    * @param xs
    * @return
    */
  def mean(xs: Seq[Double]): Option[Double] =
    if (xs.isEmpty) None
    else Some(xs.sum / xs.length)
}
*/
