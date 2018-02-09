package functionscala.chapter2

/**
  * 1.所有的表达式,包括if表达式,都产生一个结果
  * 2.在scala中,一段包含在大括号里的多行声明代码块的值等于它最后一个表达式的返回值
  */
object MyModule {

  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  def factorial(n: Int): Int = {
    //注解检查尾递归
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d."
    msg.format(n, factorial(n))
  }

  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
  }

  /**
    * main方法条用纯函数内核的外壳,并打印结果到终端
    * 有时候称这样的方法为"过程"而非函数,以突出
    * 它们是带有副作用的
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
    println(formatFactorial(7))
    println(formatResult("factorial", 7, factorial))
  }
}
