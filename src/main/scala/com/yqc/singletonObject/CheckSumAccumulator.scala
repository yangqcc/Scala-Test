package com.yqc.singletonObject

import com.yqc.classAndObject.CheckSumAccumulator

/**
  * Created by yangqc on 2017/5/13.
  *
  * 类和单例对象间的差别是,单例对象不带参数,而类可以.因为单例对象不是用new
  * 关键字实例化的,所以没有机会传递给它实例化参数.每个单例对象都被实现为虚构类的实例.
  * 并指向静态变量,因此它们与java静态类有着相同的初始化语义.单例对象在第一次被访问的时候才被
  * 初始化.
  *
  * 不与伴生类共享名称的单例对象被称为独立对象.
  *
  * 虚构类的名字是对象名加上一个美元符号.因此单例对象CheckSumAccumulator的虚构类是CheckSumAccumulator$
  */
object CheckSumAccumulator {
  private val cache = Map[String, Int]()

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new CheckSumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checkSum()
      cache + (s -> cs)
      cs
    }

  def main(args: Array[String]): Unit = {
    println(calculate("yangqc"))
  }
}
