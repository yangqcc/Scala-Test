package com.yqc.collection.list

/**
  * Created by yangqc on 2017/7/10.
  *
  * 列表和数组很相似,不过有两点重要的差别
  * 1.列表是不可变的，也就是说不能通过复制改变列表的元素
  * 2.列表具有递归结构(如链接列表:linkedlist),而数组是连续的
  *
  * 列表是同质的:列表所有的元素都具有相同的类型
  */
object ListTest1 {
  def main(args: Array[String]): Unit = {
    val fruit: List[String] = List("apples", "oranges", "pears")
    val nums: List[Int] = List(1, 2, 3, 4)
    val diag3: List[List[Int]] = List(List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1),
      List(0, 1)
    )

    println(fruit)
    println(nums)
    val list: List[Int] = for {List(x, y, z) <- diag3 if (x >= 0 && y >= 0 && z >= 0)} yield x + y + z
    for (x: Int <- list) println(x)
  }
}
