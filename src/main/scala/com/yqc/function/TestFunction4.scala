package com.yqc.function

/**
  * 函数表达式
  * Created by yangqc on 2017/9/7
  */
object TestFunction4 {

  def function1(name: String, f1: String => Int): Int = f1(name);

  def main(args: Array[String]): Unit = {
    //函数表达式都有返回值
    println(function1("yangqc", {
      println("this is innerFunction!")
      println("this is outFunction!")
      return (x: String) => x.indexOf(1)
    }))
  }
}
