package com.yqc.traitTest

/**
  * Created by yangqc on 2017/4/23.
  */
trait X {

}

class B {
  //self:X=>要求B在实例化或者定义B的子类时,
  //必须混入指定X类型,这个X类型也可以是指定为当前类型

  self: X =>
}

class C extends B with X {

  def foo = println("self type demo")
}

object SelfTypeDemo {

  def main(args: Array[String]): Unit = {
    println(new C().foo)
  }
}
