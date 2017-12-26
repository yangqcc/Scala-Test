package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/4/16.
  *
  * 在 Scala 中，是没有 static 这个东西的，但是它也为我们提供了单例模式的实现方法，那就是使用关键字 object。
  * Scala 中使用单例模式时，除了定义的类之外，还要定义一个同名的 object 对象，它和类的区别是，object对象不能带参数。
  * 当单例对象与某个类共享同一个名称时，他被称作是这个类的伴生对象：companion object。你必须在同一个源文件里定义类和它的伴生对象。
  * 类被称为是这个单例对象的伴生类：companion class。类和它的伴生对象可以互相访问其私有成员。
  */
class Fruit(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    val fruit = new Fruit(10, 20)

    def printFruit: Unit = {
      println("x的坐标是:" + fruit.x)
      println("y的坐标是:" + fruit.y)
    }

    printFruit
  }
}
