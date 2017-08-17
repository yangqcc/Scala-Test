package com.yqc.collection.list

/**
  * Created by yangqc on 2017/8/17
  */
object FlatMapTest {
  def main(args: Array[String]): Unit = {
    List.range(1, 5) flatMap (i => List.range(1, i) map (j => (i, j))) foreach (k => println(k))
  }
}
