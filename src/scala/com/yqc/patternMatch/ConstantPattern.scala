package com.yqc.patternMatch

/**
  * Created by yangqc on 2017/4/28.
  * 常量模式
  */
object ConstantPattern {
  def main(args: Array[String]): Unit = {
    //注意，下面定义的是一个函数
    //函数的返回值利用的是模式匹配后的结果作为其返回值
    //还需要注意的是函数定义在main方法中
    //也即scala语言可以在一个函数中定义另外一个函数

    //函数参数没有标明val还是var,默认为val
    def patternShow(x: Any) = x match {
      case 5 => "five"
      case true => "true"
      case "test" => "String"
      case null => "null"
      case Nil => "empty list"
      case _ => "Other constant"
    }

    println(patternShow(5))
  }
}
