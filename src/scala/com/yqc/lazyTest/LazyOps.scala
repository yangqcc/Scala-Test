package com.yqc.lazyTest

/**
  * @Author yangqc
  * @Date 2017/7/23
  */
object LazyOps {

  /**
    * 不使用lazy变量,lazy不会立即实例化
    *
    * @return
    */
  def init(): String = {
    println("call init()")
    ""
  }

  def main(args: Array[String]): Unit = {
    lazy val property = init() //使用lazy修饰
    println("after init()")
    println(property)
  }
}
