package com.yqc.classhierarchy

/**
  * Created by yangqc on 2017/7/13.
  *
  * Null不兼容值类型,因为Null是所有引用类的子类，是AnyRef的子类
  *
  * Nothing是任何类的子类
  */
object EqualsTest {

  val s1: String = new String("abc")
  val s2: String = new String("abc")
  val s3: String = "abc"

  /**
    * Nothing的一个用处是标明不正常终止
    *
    * @param message
    * @return
    */
  def error(message: String): Nothing = throw new RuntimeException(message)

  def divide(x: Int, y: Int): Int =
    if (y != 0) x / y
    else error("出错了!")

  def main(args: Array[String]): Unit = {
    println(s1 == s2)
    println(s1 equals s2)
    println(s1 eq s2)
    println(s1 eq s3)

    println(divide(1, 0))
  }
}
