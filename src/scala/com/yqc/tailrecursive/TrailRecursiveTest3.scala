package com.yqc.tailrecursive

import scala.annotation.tailrec

/**
  * Created by yangqc on 2017/5/24.
  *
  * 将一般递归函数修改为尾递归
  */
object TrailRecursiveTest3 {

  /**
    * 斐波那契数列天然递归算法
    *
    * @param n
    * @return
    */
  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  /**
    * 斐波那契数列转化为尾递归
    * {@code tailrec}用于标识是否是尾递归
    *
    * @param n
    * @param acc1
    * @param acc2
    * @return
    */
  @tailrec
  def fibonacciTailRecursive(n: Int, acc1: Int, acc2: Int): Int = {
    if (n < 2) acc2
    else fibonacciTailRecursive(n - 1, acc2, acc1 + acc2)
  }

  def main(args: Array[String]): Unit = {
    println(fibonacciTailRecursive(5, 1, 1))
  }
}
