package functionscala.chapter4

/**
  * 引用透明不依赖上下文,可以本地推倒,而那些非引用
  * 透明的表达式时依赖上下文的,需要全局推到.
  * Created by yangqc on 2018/2/16.
  */
object ExceptionHandler {
  def failingFn(i: Int): Int = {
    val y: Int = throw new Exception("fail!")
    try {
      val x = 42 + 5
      x + y
    } catch {
      case e: Exception => 43
    }
  }

  def mean(xs: Seq[Double]): Double =
    if (xs.isEmpty)
      throw new ArithmeticException("mean of empty list!")
    else xs.sum / xs.length

  def main(args: Array[String]): Unit = {
    ExceptionHandler.failingFn(21)
  }
}
