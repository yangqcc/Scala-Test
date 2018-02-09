package functionscala.chapter2

class Factorial {

  def factorial(n: Int): Int = {
    //注解检查尾递归
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  /**
    * 斐波那契数列求第n个数的值
    *
    * @param n
    * @return
    */
  def fib(n: Int): Int = {

    @annotation.tailrec
    def calculate(n: Int, s1: Int, s2: Int): Int = {
      if (n == 1) s1
      else if (n == 2) s2
      else calculate(n - 1, s2, s1 + s2)
    }

    calculate(n, 0, 1)
  }

}

object TestFactorial {
  def main(args: Array[String]): Unit = {
    println(new Factorial().fib(6))
  }
}
