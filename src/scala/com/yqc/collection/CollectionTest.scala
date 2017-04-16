package com.yqc.collection

/**
  * Created by yangqc on 2017/4/16.
  * 测试scala集合
  */
object CollectionTest {
  val x = List(1, 2, 3, 4)

  val y = Set(1, 3, 5, 7)

  val z = Map("one" -> 1, "two" -> 2, "three" -> 3)

  //创建元组
  val a = (10, "Scala")

  //定义Option,Option[T] 表示有可能包含值的容器，也可能不包含值。
  val b: Option[Int] = Some(5)

  def main(args: Array[String]): Unit = {
    println(x)
    println(y)
  }
}
