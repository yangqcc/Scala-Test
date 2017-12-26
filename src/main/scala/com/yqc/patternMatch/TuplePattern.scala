package com.yqc.patternMatch

/**
  * Created by yangqc on 2017/4/29.
  *
  * 元组匹配
  */
object TuplePattern {
  def main(args: Array[String]): Unit = {
    val t = ("spark", "hive", "SparkSQL")

    def tuplePattern(t: Any) = t match {
      case (one, _, _) => one
      case _ => "other"
    }

    println(tuplePattern(t))
  }
}
