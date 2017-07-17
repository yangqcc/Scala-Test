package com.yqc.tailRecursive

/**
  * Created by yangqc on 2017/5/24.
  */
object TrailRecursiveTest2 {

  /**
    * 递归算法，一般来说比较简单，符合人们的思维方式，但是由于需要保持调用堆栈，
    * 效率比较低，在调用次数较多时，更经常耗尽内存。
    * 因此，程序员们经常用递归实现最初的版本，然后对它进行优化，改写为循环以提高性能。尾递归于是进入了人们的眼帘。
    *
    * @param n
    * @return
    */
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  /**
    * 修改成了尾递归
    *
    * 以上的调用，由于调用结果都是直接返回，所以之前的递归调用留在堆栈中的数据可以丢弃，只需要保留最后一次的数据，这就是尾递归容易优化的原因所在，
    * 而它的秘密武器就是上面的acc，它是一个累加器（accumulator，习惯上翻译为累加器，其实不一定非是“加”，任何形式的积聚都可以），
    * 用来积累之前调用的结果，这样之前调用的数据就可以被丢弃了。
    *
    * @param n
    * @param acc
    * @return
    */
  def factorialTailRecursive(n: Int, acc: Int): Int = {
    if (n <= 1) acc
    else factorialTailRecursive(n - 1, acc * n)
  }

  def main(args: Array[String]): Unit = {
    println(factorialTailRecursive(5, 1))
  }
}
