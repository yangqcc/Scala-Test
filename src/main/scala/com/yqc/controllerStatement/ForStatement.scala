package com.yqc.controllerStatement

import java.io.File

/**
  * Created by yangqc on 2017/5/16.
  * for表达式语法对任何种类的集合类都有效,而不是数组
  * Scala中集合本身是可以被枚举的
  */
object ForStatement {

  def showFileName: Unit = {
    val filesHere = (new File(".")).listFiles()
    for (file <- filesHere) {
      println(file)
    }
  }

  def showNumber: Unit = {
    //1 to 4 是Range类型
    for (i <- 1 to 4) {
      println("Iteration " + i)
    }
  }

  def showNumber2: Unit = {
    //不包含Range的上边界使用until
    for (i <- 1 until 4) {
      println("Iteration " + i)
    }
  }
}
