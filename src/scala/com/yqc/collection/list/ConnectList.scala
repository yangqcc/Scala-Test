package com.yqc.collection.list

/**
  * 连接数组
  * Created by yangqc on 2017/8/16
  */
object ConnectList {
  def main(args: Array[String]): Unit = {
    val list1: List[Int] = 1 :: 2 :: 3 :: Nil
    val list2: List[Int] = List[Int](1, 2, 4)
    val list3 = list1 ::: list2
    list3.foreach((x: Int) => print(x + ","))
  }
}
