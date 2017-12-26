package com.yqc.implicitConversion

/**
  * Created by yangqc on 2017/5/2.
  *
  * 视界,任何T都可以,只要T能被当做Ordered[T]即可
  * 尽管Int类不是Ordered[Int]的子类,但只要Int到Ordered[Int]的隐式转换可用,
  * 任然能把List[Int] 传递maxList方法
  *
  * 视界比泛型可以用于更多的类型
  */
object ConverterPlace2 {

  def maxList[T <% Ordered[T]](elements: List[T]): T =
    elements match {
      case List() => throw new IllegalArgumentException("empty list!")
      case List(x) => x
      case x :: rest =>
        val maxVal = maxList(rest)
        if (x > maxVal) x
        else maxVal
    }

  def main(args: Array[String]): Unit = {
    val myList: List[Int] = List(1, 2, 3)
    println(maxList(myList))
  }
}
