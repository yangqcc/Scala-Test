package com.yqc.traitTest

/**
  * Created by yangqc on 2017/4/23.
  *
  * self=>定义了this的别名,它是self type的一种特殊形式,
  * 这里的self并不是关键字,可以是任何名称
  */
class A {

  //  self =>

  hh =>

  val x = 2

  def foo: Unit = println(hh.x + this.x)
}

object A {

  //TODO 函数加()与不加()的区别
  def apply() = new A()

  def main(args: Array[String]): Unit = {
    A().foo
  }
}
