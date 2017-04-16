package com.yqc.operator

/**
  * Created by yangqc on 2017/4/16.
  * scala位运算符
  */
object Operator {
  def main(args: Array[String]): Unit = {
    var a: Int = 60 //60=0011 1100
    var b = 13 //13=0000 1101
    var c = 0

    c = a & b //c =0000 1100=12
    println("a & b = " + c)

    c = a | b
    println("a | b = " + c)

    // ^ 按位
    c = a ^ b
    println("a ^ b = " + c)

    c = ~a //取反，1100 0011 =-61
    println("~a = " + c)
  }
}
