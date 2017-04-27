package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/4/16.
  * Scala中的类不声明为public，一个Scala源文件中可以有多个类。
  * 以上实例的类定义了两个变量 x 和 y ，一个方法：move，方法没有返回值。
  * Scala 的类定义可以有参数，称为类参数，如上面的 xc, yc，类参数在整个类中都可以访问。
  *
  * 构造器中的参数如果不被声明为var的话，它默认的话是val类型的，但一般不推荐将构造器中的参数声明为var
  */
class Point(val xc: Int, val yc: Int) {

  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println("x 的坐标点:" + x)
    println("y 的坐标点:" + y)
  }
}

object Test2 {
  def main(args: Array[String]): Unit = {
    val pt = new Point(10, 10)

    //移动到一个新的位置
    pt.move(10, 30)
  }
}