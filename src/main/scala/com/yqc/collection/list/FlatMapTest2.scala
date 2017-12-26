package com.yqc.collection.list

/**
  * flatMap和map的区别
  * map就是把以前List中的每一元素转化成另外一个元素
  * flatMap是把list中每一个可遍历的元素拿出来放在list里面
  * Created by yangqc on 2017/8/18
  */
object FlatMapTest2 {
  def main(args: Array[String]): Unit = {
    val list: List[String] = List("afds", "dada", "dasa")
    val list2: List[Int] = List(1, 2, 4, 5, 6)
    list flatMap (_.toList) foreach (s => println(s))
    println("======================")
    list map (_.toList) foreach (s => println(s))
    println("===========flatMap===========")
    list flatMap (s => s + "!") foreach (m => println(m))
    println("===========map===========")
    list map (s => s + "!") foreach (m => println(m))
    println("===========flatMap===========")
    list2 flatMap (s => (s + 1).toString) foreach (s => println(s))
    println("===========map===========")
    List.range(1, 10) map (i => List.range(1, i) map (j => (i, j))) foreach (x => println(x))
    println("===========flatMap===========")
    List.range(1, 10) flatMap (i => List.range(1, i) map (j => (i, j))) foreach (x => println(x))
  }
}
