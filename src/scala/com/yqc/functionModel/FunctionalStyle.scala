package com.yqc.functionModel

/**
  * Created by yangqc on 2017/5/18.
  * 函数风格修改乘法表
  */
object FunctionalStyle {

  //一序列形式返回一行乘法表
  def makeRowSeq(row: Int) =
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }

  def makeRow(row: Int) = makeRowSeq(row).mkString

  def multiTable() = {
    val tableSeq =
      for (row <- 1 to 10)
        yield makeRow(row)

    tableSeq.mkString("\n")
  }

  def main(args: Array[String]): Unit = {
    println(multiTable())
  }
}
