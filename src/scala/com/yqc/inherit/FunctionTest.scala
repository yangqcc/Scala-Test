package com.yqc.inherit

/**
  * Created by yangqc on 2017/4/19.
  */
object FunctionTest {

  /**
    * 该函数返回了一个(x:Double)匿名函数
    *
    * @param factor
    * @return
    */
  def multiplyBy(factor: Double) = (x: Double) => factor * x

  /**
    * 函数柯里化
    *
    * @param factor
    * @param x
    * @return
    */
  def multiplyBy2(factor: Double)(x: Double) = x * factor

  def main(args: Array[String]): Unit = {
    var x: Double = 21
    println(multiplyBy(x)(2))
    println(multiplyBy2(x)(2))
  }
}
