package com.yqc.classAndObject.apply

/**
  * Created by yangqc on 2017/7/18.
  */
class UpdateClass {

  def update(arg1: Int, arg2: String, arg3: String): String = {
    println("update method called!")
    arg1 + "|" + arg2 + "|" + arg3
  }
}

object UpdateClass {
  def main(args: Array[String]): Unit = {
    val obj = new UpdateClass
    val result = (obj(1, "key1") = "Hello")
    println(result)

  }
}