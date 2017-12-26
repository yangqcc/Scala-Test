package com.yqc.function

/**
  * Created by yangqc on 2017/4/16.
  * 匿名函数
  */
object AnonymousFunction {

  var factor = 3

  val multiplier = (i: Int) => i * factor

  //变量可以是一个函数
  var inc = (x: Int) => x + 1

  def add2 = new Function[Int, Int] {
    def apply(x: Int): Int = x + 1
  }

  //多个参数的匿名函数
  var mul = (x: Int, y: Int) => x * y

  def main(args: Array[String]): Unit = {
    println(mul(12, 12))
    println(inc(12))
    println(multiplier(3))
  }

}
