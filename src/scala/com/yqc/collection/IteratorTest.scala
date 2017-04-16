package com.yqc.collection

/**
  * Created by yangqc on 2017/4/16.
  * scala 迭代器
  */
object IteratorTest {
  def main(args: Array[String]): Unit = {
    val it = Iterator("Java", "Scala", "JavaScript")
    while (it.hasNext) {
      println(it.next())
    }

    val ita = Iterator(10, 20, 50, 60)
    val itb = Iterator(20, 56, 11, 2)

    //查找最大，最小元素
    println("最大元素是:" + ita.max)
    println("最小元素是:" + itb.min)
  }
}
