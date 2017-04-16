package com.yqc.function

/**
  * Created by yangqc on 2017/4/16.
  */
object TestFunction1 {
  def main(args: Array[String]): Unit = {
    delayed(time())
  }

  def time(): Long = {
    println("获取时间，单位为纳秒!")
    return System.nanoTime()
  }

  def delayed(t: => Long) = {
    println("在delayed方法内")
    println("参数: " + t)
    t
  }
}
