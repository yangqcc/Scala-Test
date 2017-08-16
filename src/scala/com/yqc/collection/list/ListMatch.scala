package com.yqc.collection.list

/**
  * List 模式匹配
  * Created by yangqc on 2017/8/16
  */
object ListMatch {

  /**
    * 以下代码实现了插入排序
    *
    * @param xs
    * @return
    */
  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case x :: xs1 => insert(x, isort(xs1))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }

  def listMatch(x: List[Int]): List[Int] = x match {
    case List() => List(12, 21)
    case x :: x2 :: ys =>
      //      println(x)
      ys.foreach(x => println(x))
      ys
  }

  def main(args: Array[String]): Unit = {
    val myList = 1 :: 2 :: 3 :: 4 :: Nil
    val myList2 = 42 :: 13 :: 25 :: 6 :: 7 :: Nil

    isort(myList2).foreach((x: Int) => print(x + " "))
  }
}
