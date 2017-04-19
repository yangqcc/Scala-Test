package com.yqc.inherit

/**
  * Created by yangqc on 2017/4/19.
  */
object MapFunction {
  def main(args: Array[String]): Unit = {
    var myArray: Array[String] = Array[String]("spark", "hive", "hadoop")
    var anotherArray: Array[String] = myArray.map((x: String) => x * 2)
    for (x <- anotherArray) {
      println(x)
    }
  }
}
