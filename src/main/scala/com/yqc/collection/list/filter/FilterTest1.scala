package com.yqc.collection.list.filter

/**
  * Created by yangqc on 2017/8/19
  */
class FilterTest1 {
  def ::(z: Int)(op: (Int, Int) => Int): Int = op(z + 1, z + 1)

  def h(z: Int) = (op: (Int, Int) => Int) => op(z + 1, z + 1)

  def &&(z: Int): Int = z + 1
}

object FilterTest1 {

  def apply: FilterTest1 = new FilterTest1()

  def hasZeroRow(m: List[List[Int]]) = m exists (row => row forall (_ == 0))

  def sum(xs: List[Int]): Int = xs./:(0)(_ + _)

  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5)
    list.filter(_ % 2 == 0).foreach(print(_))
    println("===============================")
    val words: List[String] = List("asdd", "nicholas", "bob")
    println("==============partition=================")
    /**
      * partition会返回一个tuple
      */
    val resultList: (List[String], List[String]) = words partition (_.length == 3)
    println(resultList)

    val intList: List[List[Int]] = List(List(1, 2, 3), List(2, 3, 3), List(10, 2))
    println(hasZeroRow(intList))

    val intList2: List[Int] = List(1, 2, 4, 5, 6)
    println(sum(intList2))

    val filterTest1: FilterTest1 = new FilterTest1()

    def myFunction(x1: Int, x2: Int) = x1 + x2

    println(filterTest1.::(2)(myFunction))
    println((2 :: filterTest1) (myFunction))
    (1 /: List[Int](1)) (_ + _)
    println((filterTest1 h 2) (myFunction))
  }
}
