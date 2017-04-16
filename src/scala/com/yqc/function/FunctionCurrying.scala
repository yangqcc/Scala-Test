package com.yqc.function

/**
  * Created by yangqc on 2017/4/16.
  * 函数柯里化:柯里化(Currying)指的是将原来接受两个参数的函数变成新的接受一个参数的函数的过程。新的函数返回一个以原有第二个参数为参数的函数。
  */
object FunctionCurrying {
  //  def add(x: Int, y: Int) = x + y

  //function currying
  def add(x: Int)(y: Int) = x + y

  def stract(x: String)(y: String) = x + " " + y

  def main(args: Array[String]): Unit = {
    println(add(1)(2))

    val str1: String = "Hello"
    val str2: String = "Scala!"

    println(stract(str1)(str2))
  }
}
