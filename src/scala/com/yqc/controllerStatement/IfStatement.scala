package com.yqc.controllerStatement

/**
  * Created by yangqc on 2017/5/16.
  * Scala的if语句可以返回值
  */
object IfStatement {

  /**
    * 计算最大公约数
    *
    * @param x
    * @param y
    * @return
    */
  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  var line = ""
  /**
    * 因为不能产生有实际意义的结果.结果类型是Unit.
    * 是表明存在并且唯一存在的类型为Unit的值.成为unit value,写成()
    * ()的存在是Scala的Unit不同于Java的void的地方
    */
  do {
    line = readLine()
    println("Read: " + line)
  } while (line != "")

  def main(args: Array[String]): Unit = {
    val fileName = if (!args.isEmpty) args(0)
    else "default.txt"
  }
}
