package com.yqc.collection.list

/**
  * Created by yangqc on 2017/8/16
  */
object ListTest2 {

  def showName = (x: String) => println("元素是" + x)

  def main(args: Array[String]): Unit = {
    val list: List[String] = "orange" :: "apple" :: "brown" :: Nil
    list.foreach((x: String) => println("元素：" + x))
    //list的tail返回第一个元素除外的所有的元素的列表
    list.tail.foreach(showName)
    println(list.head)
  }
}
