package com.yqc.collection.list.sort

/**
  * Created by yangqc on 2017/8/19
  */
object ListSort1 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, -3, 4, 3, 6)
    val result: List[Int] = list sortWith (_ < _)
    list foreach ((x: Int) => print(x + ","))
    println("=========sort=========")
    result foreach ((x: Int) => print(x + ","))
  }
}
