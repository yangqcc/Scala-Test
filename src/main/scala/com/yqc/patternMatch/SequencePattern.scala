package com.yqc.patternMatch

/**
  * Created by yangqc on 2017/4/29.
  */
object SequencePattern {
  def main(args: Array[String]): Unit = {
    val p = List("Spark", "hive", "SparkSQL")

    def sequencePattern(p: List[String]) = p match {
      case List(_, second, _*) => second
      case List(first, _) => first
      case List(_, _, third) => third
      case _ => "other"
    }

    println(sequencePattern(p))
  }
}
