package com.yqc.classAndObject.apply

/**
  * Created by yangqc on 2017/7/18.
  */
class EMail(val name: String, val age: Int) {

  //辅助构造器
  def this(name: String) = this(name, 12)

  require(age > 0)

  println("this is EMail class!")

  override def toString: String = "name is " + name + ", and age is " + age
}

class AnotherEMail

object AnotherEMail {
  def apply(name: String): String = name
}

object EMail {

  def apply(name: String, age: Int): EMail = {
    println("this is EMail object!")
    new EMail(name, age)
  }

  def main(args: Array[String]): Unit = {
    /**
      * EMail其实调用的是伴生类中的apply方法
      */
    println(EMail("Nicholas", 21))
    println(AnotherEMail("12"))
  }
}
