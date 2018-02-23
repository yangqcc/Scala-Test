package functionscala.chapter4

/**
  * Created by yangqc on 2018/2/19.
  */

/*sealed trait Either[+E, +A]

case class Left[+E](value: E) extends Either[E, Nothing]

case class Right[+A](value: A) extends Either[Nothing, A]*/

object EitherTest {

  def mean(xs: IndexedSeq[Double]): Either[String, Double] =
    if (xs.isEmpty)
      Left("mean of empty list!")
    else
      Right(xs.sum / xs.length)

  /**
    * 使用Left返回错误的堆栈信息
    *
    * @param x
    * @param y
    * @return
    */
  def safeDiv(x: Int, y: Int): Either[Exception, Int] =
    try
      Right(x / y)
    catch {
      case e: Exception => Left(e)
    }

  def main(args: Array[String]): Unit = {
  }
}
