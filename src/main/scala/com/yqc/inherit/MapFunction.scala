package com.yqc.inherit

/**
  * Created by yangqc on 2017/4/19.
  */
object MapFunction {
  def main(args: Array[String]): Unit = {
    var myArray: Array[String] = Array[String]("spark", "hive", "hadoop")
    var anotherArray: Array[String] = myArray.map((x: String) => x * 2)
    println("map函数")
    for (x <- anotherArray) {
      println(x)
    }

    /**
      * 省略匿名函数类型
      */
    println("省略匿名函数类型")
    for (x <- myArray.map((x) => x + ",省略匿名函数类型")) {
      println(x)
    }

    println("省略括号")
    for (x <- myArray.map(x => x + "'s")) {
      println(x)
    }

    /**
      * 函数在右边是用一次，可以用占位符
      */
    println("使用占位符")
    for (x <- myArray.map(_ + "占位符")) {
      println(x)
    }
  }
}
