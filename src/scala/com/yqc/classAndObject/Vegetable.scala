package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/4/22.
  */
abstract class Vegetable(var name: String) {

  //一般类中定义字段的话必须初始化,而抽象类中则没有这要求
  var height: Int

  def eat: Unit
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


