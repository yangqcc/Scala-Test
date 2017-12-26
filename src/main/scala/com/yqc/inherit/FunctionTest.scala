package com.yqc.inherit

/**
  * Created by yangqc on 2017/4/19.
  */
object FunctionTest {

  def multiplyByTow(first: Double, second: Double) = (x: Double, y: Double) => x * y

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

  def multiplyBy23(factor: Double)(x: Double) = multiplyByTow(x, factor)

  def multiplyBy24(factor: Double) = (x: Double) => multiplyByTow(x, factor)


  def multiplyBy3(factor: Double)(x: Double)(y: Double) = x * factor + y

  /**
    * 等价于上面的函数
    *
    * @param factor
    * @return
    */
  def multiplyBy4(factor: Double) = (x: Double) => (y: Double) => factor * x + y

  def main(args: Array[String]): Unit = {
    var x: Double = 21
    println(multiplyBy(x)(2))
    println(multiplyBy2(x)(2))
    println(multiplyBy3(x)(2)(1))
    println(multiplyBy4(x)(2)(1))
  }
}
