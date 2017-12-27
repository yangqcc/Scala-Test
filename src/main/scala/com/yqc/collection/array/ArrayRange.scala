package com.yqc.collection.array

/**
  * Created by yangqc on 2017/4/16.
  * 创建区间数组
  */
object ArrayRange {
  def main(args: Array[String]): Unit = {
    val myList1 = Array.range(10, 20, 2)
    val myList2 = Array.range(10, 20)

    for (x <- myList1) {
      println(x)
    }

    for (x <- myList2) {
      println(x)
    }

    //生成三维数组
    var myArray = Array.ofDim[String](10, 10, 10)
    for (i <- 0 to 9)
      for (j <- 0 to 9)
        for (k <- 0 to 9) {
          myArray(i)(j)(k) = (i * j * k).toString
          println(myArray(i)(j)(k))
        }
  }
}
