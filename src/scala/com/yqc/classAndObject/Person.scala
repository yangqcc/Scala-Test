package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/4/16.
  * Scala重写一个非抽象方法，必须用override修饰符。
  */
class Person {
  var name = ""

  override def toString = getClass.getName + "[name=" + name + "]"
}

class Employee extends Person {
  var salary = 0.0

  override def toString = super.toString + "[salary=" + salary + "]"
}

object Test3 extends App {
  val fred = new Employee
  fred.name = "Fred"
  fred.salary = 50000
  println(fred)
}