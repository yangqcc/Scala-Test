package com.yqc.collection

import scala.collection.mutable.ArrayBuffer

/**
  * Created by yangqc on 2017/4/20.
  * 变长数组,妈的,变长数组太他妈爽了
  */
object ArrayBufferTest {

  val strArrayVar = ArrayBuffer[String]()

  //尾部添加元素
  strArrayVar += "Hello"

  //+=后面可以添加多个元素
  strArrayVar += ("Hello", "Programmer")

  def main(args: Array[String]): Unit = {
    //++=用于向数组中追加内容,++=右侧可以是任何操作
    //追加数组
    strArrayVar ++= Array("Welcome", "To", "Scala")

    for (x <- strArrayVar)
      print(x)

    //追加list
    println()
    println("============================")
    strArrayVar ++= List("Welcome", "To", "Scala")
    for (x <- strArrayVar)
      print(x)

    println()
    println("============================")
    //删除末尾n个元素
    strArrayVar.trimEnd(3)
    for (x <- strArrayVar)
      print(x)

    for (x <- 0 to strArrayVar.length - 1)
      print(x)
  }

}
