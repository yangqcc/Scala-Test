package com.yqc.patternMatch

/**
  * Created by yangqc on 2017/4/29.
  *
  * 类型模式
  */
object TypePattern {
  def main(args: Array[String]): Unit = {
    def typePattern(t: Any) = t match {
      case t: String => "String"
      case t: Int => "Integer"
      case t: Double => "Double"
    }

    def typePattern2(t: Any) = {
      if (t.isInstanceOf[String]) "String"
      else if (t.isInstanceOf[Int]) "Int"
      else if (t.isInstanceOf[Double]) "Double"
      else if (t.isInstanceOf[Map[_, _]]) "Map"
    }

    println(typePattern(5.0))
  }
}
