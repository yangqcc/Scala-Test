package com.yqc.inherit

/**
  * Created by yangqc on 2017/4/19.
  */
object ListFunction {
  def main(args: Array[String]): Unit = {
    val myList = List[(String, Int)]("Spark" -> 1, "hive" -> 2, "hadoop" -> 2)
    for (y <- myList.map(x => x._1)) {
      println(y)
    }

    println("使用占位符:")
    for (y <- myList.map(_._1)) {
      println(y)
    }

    println("获取第二个元素:")
    for (y <- myList.map(_._2)) {
      println(y)
    }
  }
}
