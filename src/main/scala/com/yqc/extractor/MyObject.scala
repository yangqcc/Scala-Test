package com.yqc.extractor

/**
  * Created by yangqc on 2017/7/18.
  */
object MyObject {

  def apply(y: Int)(x: Int => String): String = x(y)
}

object TestApply {
  def main(args: Array[String]): Unit = {
    val myFunction: Int => String = (x: Int) => x.toString
    println(myFunction)
    println(myFunction(13))
    println(MyObject(21)(myFunction))
    //    myFunction()
  }
}
