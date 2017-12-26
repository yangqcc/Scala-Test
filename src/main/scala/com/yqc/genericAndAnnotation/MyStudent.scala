package com.yqc.genericAndAnnotation

/**
  * Created by yangqc on 2017/4/30.
  */
class MyStudent[T, S <% Comparable[S]](var name: T, var height: S) {

  override def toString: String = {
    "name:" + name + ",height:" + height
  }
}

object ViewBound {
  def main(args: Array[String]): Unit = {
    val s = new MyStudent("john", "170")
    //下面这条语句在视图界定中是合法的
    //因为Int类型此时会隐工转换为
    //RichInt类，而RichInt类属于Comparable、
    //继承层次结构
    val s2 = new MyStudent("john", 170)
    println(s)
  }
}
