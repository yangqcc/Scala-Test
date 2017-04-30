package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/4/22.
  */
abstract class Vegetable {

  //一般类中定义字段的话必须初始化,而抽象类中则没有这要求
  var height: Int

  def eat: Unit

  def this(name: String) = {
    this()
    println("我是构造函数!")
  }

  def this(height: Int) = {
    this();
    this.height = height
  }
}

class MyVegetable(name: String) extends Vegetable(name) {
  override var height: Int = _

  override def eat: Unit = {
    println("eat by mouth")
  }
}

object MyVegetable {
  def apply(name: String) = new MyVegetable(name)

  def main(args: Array[String]): Unit = {
    MyVegetable("Apple").eat
  }
}

/**
  * 伴生类都是静态方法
  */
object Vegetable2 extends Vegetable {

  override var height: Int = 12

  override def eat: Unit = println(height)

  def showHeight() = {
    println(height)
  }

  def main(args: Array[String]): Unit = {
    Vegetable2.showHeight()
  }
}


