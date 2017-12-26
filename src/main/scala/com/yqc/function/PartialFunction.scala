package com.yqc.function

import java.util.Date

/**
  * Created by yangqc on 2017/4/16.
  * 偏应用函数:Scala 偏应用函数是一种表达式，你不需要提供函数需要的所有参数，只需要提供部分，或不提供所需参数
  */
object PartialFunction {
  def main(args: Array[String]): Unit = {
    //传统函数调用
    val date = new Date
    log(date, "message")
    Thread.sleep(1000)
    log(date, "message2")
    Thread.sleep(1000)
    log(date, "message3")
    println("---PartialFunction---")

    //偏应用函数
    val logWithDateBound = log(date, _: String)

    logWithDateBound("message1")
    logWithDateBound("message2")
    logWithDateBound("message3")
  }

  def log(date: Date, message: String) = {
    println(date + "--------" + message)
  }
}
