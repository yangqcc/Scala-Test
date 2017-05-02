package com.yqc.collection

/**
  * Created by yangqc on 2017/4/20.
  *
  * scala数组有泛型
  */
object ArrayTest1 {

  //数组也有泛型，真爽,全部初始化为0
  val numberArray = new Array[Int](10)
  //元素赋值
  numberArray(0) = 10

  //调用方法其实是调用其apply方法进行数组创建操作的
  val strArray2 = Array("First", "Second")

  def main(args: Array[String]): Unit = {
    for (x <- numberArray)
      println(x)

    for (x <- strArray2)
      println(x)
  }

}
