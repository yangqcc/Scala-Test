package com.yqc.genericAndAnnotation

/**
  * Created by yangqc on 2017/5/2.
  *
  * 隐式转换使用场景1：转换为期望类型
  *
  * 注意：Int类型转换为Double类型,有较小精度转换为较大精度,导致精度损失,
  * 所以不推荐这样做
  *
  */
object ConverterPlace1 {

  implicit def doubleToInt(i: Double): Int = i.toInt

  def main(args: Array[String]): Unit = {

    //如果没有隐式转换函数,下面代码将会报错
    val i: Int = 3.5
    println(i)
  }
}
