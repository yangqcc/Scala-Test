package com.yqc.lazyTest

/**
  * scala 的 lazy方法
  *
  * @Author yangqc
  * @Date 2017/7/23
  */
class LazyTest(val name: String) {
  self =>

  lazy val showName = {
    println("this is lazy method!")
    init(self.name)
  }

  val noLazyName = {
    println("this is no lazy key word!")
    init(self.name)
  }

  def init(name: String) = {
    println("this is init method!")
    name
  }
}

object LazyTest {

  def apply(name: String): LazyTest = new LazyTest(name)

  def main(args: Array[String]): Unit = {
    LazyTest("Nicholas")
  }
}
