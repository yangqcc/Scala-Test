package com.yqc.`package`

/**
  * Created by yangqc on 2017/4/22.
  */
class OuterClass {
  private var x: Int = 0

  class InnerClass {
    private var y: Int = 0

    //内部类可以直接访问外部类的成员变量和方法,即便是private修饰的
    def getOuterX = x
  }

}

object OuterClass {
  def main(args: Array[String]): Unit = {
    val o = new OuterClass
    val i = new o.InnerClass
    println(i.getOuterX)
  }
}
