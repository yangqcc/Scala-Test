package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/4/22.
  *
  * Null类型是所有AnyRef类型的子类型，也即它处于AnyRef类的底层，对应java中的null引用。
  * 而Nothing是scala类中所有类的子类，它处于scala类的最底层。
  *
  * 注意:Null类型是所有的AnyRef类型的子类,所以它不能作为值类型的子类
  * 因为值类型是AnyVal的子类
  */
object NothingAndNull {

  var x: Int = 1

  //Nothing这个类一般用于只是程序的非正常返回结构,
  //利用Nothing作为返回值可以增加程序的灵活性
  def error(msg: String): Nothing = {
    throw new RuntimeException(msg)
  }

  def divide(x: Int, y: Int): Int = {
    if (y != 0)
      x / y
    else
      error("can't divide by zero!")
  }

  def main(args: Array[String]): Unit = {
    println(x)
  }
}
