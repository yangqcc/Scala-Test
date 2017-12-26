package com.yqc.function

/**
  * Created by yangqc on 2017/4/16.
  * 递归函数:递归函数意味着函数可以调用它本身
  */
object RecursiveFunction {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println(i + " 的阶乘为:= " + factorial(i))
    }
  }

  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }
}
