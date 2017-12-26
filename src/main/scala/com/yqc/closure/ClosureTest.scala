package com.yqc.closure

/**
  * Created by yangqc on 2017/4/16.
  * 函数闭包，scala这个闭包比java做得好多了
  * 测试git
  */
//TODO 闭包详解，和java以及javascript比较
object ClosureTest {
  var factor = 3

  val multiplier = (i: Int) => {
    factor = factor + 1
    i * factor
  }

  def main(args: Array[String]): Unit = {
    println(multiplier(12))
    println(factor)
  }
}
