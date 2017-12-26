package com.yqc.genericAndAnnotation

/**
  * Created by yangqc on 2017/5/2.
  *
  * 隐式转换函数放到伴生对象中
  */
class Vegetable(name: String) {

  def showName = println(name)
}

class Apple(name: String) {

  def getName(): String = name
}

object Apple {

  implicit def appleToVegetable(apple: Apple): Vegetable = new Vegetable(apple.getName())

  def main(args: Array[String]): Unit = {
    new Apple("this is apple!").showName
  }
}


