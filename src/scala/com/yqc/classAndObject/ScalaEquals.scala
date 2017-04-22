package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/4/22.
  *
  * scala中的==操作它不区分你是原生类型还是引用类型
  * 对于引用类型，它实际上是用equals方法对==方法进行实现，这样避免了程序设计时存在的某些问题
  */
object ScalaEquals {
  def main(args: Array[String]): Unit = {
    val x = new String("123")
    val y = new String("123")
    println(x == y)

    //AnyRef中提供了eq、ne两个方法用于判断两个引用是否相等
    println(x.eq(y))

    println(x.ne(y))
  }
}
