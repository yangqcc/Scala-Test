package com.yqc.parameterType

/**
  * Created by yangqc on 2017/4/20.
  *
  * 利用<%符号对泛型S进行限定
  * 它的意思是S可以是Comparable类继承层次结构
  * 也可以是能够经过隐式转换得到的类，该类实现了
  * Comparable接口
  */
case class Animal[T, S <% Comparable[S]](var name: T, var height: S)

object ViewBound extends App {
  val s = Animal("john", "170")
  val s2 = Animal("john", 170)
}
