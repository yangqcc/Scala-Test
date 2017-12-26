package com.yqc.function

import scala.io.Source

/**
  * Created by yangqc on 2017/5/18.
  * 函数式编程的重要设计原则:程序应该被结构成若干小的函数,
  * 每块实现一个定义完备的任务
  */
object LongLines {

  def processFile(fileName: String, width: Int): Unit = {
    val source = Source.fromFile(fileName)
    for (line <- source.getLines())
      processLine(fileName, width, line)
  }

  private def processLine(fileName: String, width: Int, line: String): Unit = {
    if (line.length > width)
      println(fileName + ": " + line.trim)
  }

  /**
    * 函数内部再加入函数
    *
    * @param fileName
    * @param width
    */
  def processFile2(fileName: String, width: Int): Unit = {

    def processLine(line: String): Unit = {
      if (line.length > width)
        print(fileName + ":" + line)
    }

    val source = Source.fromFile(fileName)
    for (line <- source.getLines()) {
      processLine(line)
    }
  }
}
