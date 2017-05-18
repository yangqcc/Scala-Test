package com.yqc.functionModel

/**
  * Created by yangqc on 2017/5/18.
  * Scala与Java不同,内部范围的同名变量会屏蔽外部范围
  * 的变量,但是这种方法并不太妥当
  */
class VariableRange2 {
  val a = 1;
  {
    val a = 2
    println(a)
  }

  println(a)
}

object VariableRange2 {

  def main(args: Array[String]): Unit = {
    new VariableRange2()
  }
}
