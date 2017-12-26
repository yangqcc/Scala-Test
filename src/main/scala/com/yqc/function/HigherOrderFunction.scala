package com.yqc.function

/**
  * Created by yangqc on 2017/4/16.
  * 高阶函数:高阶函数（Higher-Order Function）就是操作其他函数的函数。
  *
  * Scala 中允许使用高阶函数, 高阶函数可以使用其他函数作为参数，或者使用函数作为输出结果。
  * 高阶函数:
  * 参数为函数的函数或者是出参为函数的函数
  */
object HigherOrderFunction {

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString + "]"

  def outFunction(name: String, age: Int): (String, Int) => String = (x: String, y: Int) => x + y + name + age

  def main(args: Array[String]): Unit = {
    println(apply(layout, 10))
    println(outFunction("qicheng", 213)("shijai1", 28))
  }

}
