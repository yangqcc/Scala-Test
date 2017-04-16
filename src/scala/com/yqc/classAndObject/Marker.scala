package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/4/16.
  */
//私有构造方法
//TODO scala怎么定义多个构造函数
class Marker private(val color: String) {
  println("创建" + this)

  override def toString(): String = "颜色标记:" + color
}

// 伴生对象，与类共享名字，可以访问类的私有属性和方法
//TODO 伴生对象的要求，有什么特殊之处
object Marker {
  //TODO scala什么时候初始化变量，初始化变量和常量有什么区别
  private val markers: Map[String, Marker] = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )

  //TODO apply函数有什么特殊之处
  def apply(color: String) = (
    if (markers.contains(color))
      markers(color)
    else
      null
    )

  def getMarker(color: String) = {
    if (markers.contains(color))
      markers(color)
    else
      null
  }

  def main(args: Array[String]): Unit = {
    println(Marker("red"))
    // 单例函数调用，省略了.(点)符号
    println(Marker getMarker "blue")
  }
}
