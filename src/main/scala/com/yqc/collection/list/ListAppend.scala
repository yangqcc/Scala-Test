package com.yqc.collection.list

/**
  * Created by yangqc on 2017/8/16
  */
object ListAppend {

  def append[T](xs: List[T], ys: List[T]): List[T] =
    xs match {
      case List() => ys
      case x :: xs1 => x :: append(xs1, ys)
    }

  def showListValue[T](list: List[T]) = {
    list.foreach((x: T) => print(x + ","))
    println()
  }

  /**
    * 实现翻转操作
    *
    * @param xs
    * @tparam T
    * @return
    */
  def rev[T](xs: List[T]): List[T] = xs match {
    case List() => List()
    case x :: xs1 => rev(xs1) ::: List(x)
  }

  def main(args: Array[String]): Unit = {
    var list: List[Int] = List(1, 2, 3, 4, 5)
    val list2: List[Int] = List(2, 3, 77, 88)
    showListValue(append(list, list2))
    println(list.isEmpty)
    //翻转列表
    showListValue(list.reverse)
    showListValue(rev(list2))
    println(list.hashCode())
    list ++= list2
    println(list.hashCode())
    showListValue(list map ((x: Int) => x + 1))
  }
}
