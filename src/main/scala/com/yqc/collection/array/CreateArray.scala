package com.yqc.collection.array

/**
  * Created by yangqc on 2017/4/16.
  * 创建数组的方式
  */
object CreateArray {
  var z: Array[String] = new Array[String](3)

  var y = new Array[String](3)

  def setArrayValue(x: Array[String]) = {
    x(0) = "Java"
    x(1) = "Scala"
    x(4 / 2) = "JavaScript"
  }

  def main(args: Array[String]): Unit = {
    setArrayValue(y)
    for (i <- y) {
      println(i)
    }

    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    //合并数组
    var myList3 = Array.concat(myList1, myList2)

    for (i <- myList3)
      println(i)
  }
}
