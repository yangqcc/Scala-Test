package com.yqc.function

/**
  * Created by yangqc on 2017/4/16.
  * 函数的默认参数
  */
object DefaultValueFunction {

  def main(args: Array[String]): Unit = {
    println("返回值: " + addInt())
  }

  def addInt(a: Int = 5, b: Int = 10) = {
    var sum: Int = 0
    sum = a + b
    sum
  }
}
