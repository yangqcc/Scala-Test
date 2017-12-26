package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/4/16.
  *
  * Scala继承一个基类跟Java很相似, 但我们需要注意一下几点：
  *
  * 1、重写一个非抽象方法必须使用override修饰符。
  * 2、只有主构造函数才可以往基类的构造函数里写参数。
  * 3、在子类中重写超类的抽象方法时，你不需要使用override关键字。
  *
  * scala只允许继承一个父类
  *
  */
class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x = x + dx
    y = y + dy
    z = z + dz

    println("x的坐标点:" + x)
    println("y的坐标点:" + y)
    println("z的坐标点:" + z)
  }
}

object Test1 {
  def main(args: Array[String]): Unit = {
    val location = new Location(10, 20, 15)
    location.move(10, 20, 30)
  }
}
