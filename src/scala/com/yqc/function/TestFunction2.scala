package com.yqc.function

/**
  * Created by yangqc on 2017/4/16.
  * 执行函数参数名
  */
object TestFunction2 {
  def main(args: Array[String]): Unit = {
    printInt(b = 5, a = 7)
  }

  def printInt(a: Int, b: Int): Unit = {
    println("Value of a: " + a)
    println("Value of b: " + b)
  }
}
