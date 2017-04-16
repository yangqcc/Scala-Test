package com.yqc.function

/**
  * Created by yangqc on 2017/4/16.
  *
  * 可变参数
  */
object TestFunction3 {
  def main(args: Array[String]): Unit = {
    printStrings("Hello", "Scala", "Java")
    //我操，太他妈爽了
    println(printSum("Scala", x => x * x)(1, 4))
  }

  def printValue(name: String, ints: Int*): Unit = {
    for (value <- ints) {
      println(value)
    }
    println(name)

  }

  /**
    * scala返回一个函数
    *
    * @param name
    * @param f
    * @return
    */
  def printSum(name: String, f: Int => Int): (Int, Int) => Int = {

    def sumF(a: Int, b: Int): Int = {
      if (a > b) 0
      else f(a) + sumF(a + 1, b)
    }

    sumF
  }

  def getValue(a: Int): Int = {
    a
  }

  def printStrings(args: String*) = {
    var i: Int = 0;
    for (arg <- args) {
      println("Arg value[" + i + "]=" + arg)
      i = i + 1
    }
  }
}
