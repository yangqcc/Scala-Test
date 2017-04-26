package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/4/22.
  *
  * Null类型是所有AnyRef类型的子类型，也即它处于AnyRef类的底层，对应java中的null引用。
  * 而Nothing是scala类中所有类的子类，它处于scala类的最底层。
  *
  * 根类Any有两个子类，它们分别是AnyVal和AnyRef，其中AnyVal是所有scala内置的值类型（ Byte, Short, Char, Int, Long, Float, Double, Boolean, Unit.）的父类
  * 其中 Byte, Short, Char, Int, Long, Float, Double, Boolean与java中的byte,short,char,int,long,float,double,boolean原生类型对应，
  * 而Unit对应java中的void类型，由于（ Byte, Short, Char, Int, Long, Float, Double, Boolean, Unit）继承AnyVal，而AnyVal又继承Any，
  * 因此它们也可以调用toString等方法。
  *
  * 注意:Null类型是所有的AnyRef类型的子类,所以它不能作为值类型的子类
  * 因为值类型是AnyVal的子类
  *
  * ()可以作为Unit类型的实例，它同样可以调用toString等方法
  */
object NothingAndNull {

  var x: Int = 1
  var y: Animal = null

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
    println(y)
  }
}
