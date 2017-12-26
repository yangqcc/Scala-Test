package com.yqc.patternMatch

/**
  * Created by yangqc on 2017/4/29.
  * Option 模式匹配
  */
object OptionPattern {
  def main(args: Array[String]): Unit = {
    val m = Map("hive" -> 2, "spark" -> 3, "Spark MLlib" -> 4)

    def mapPattern(t: String) = m.get(t) match {
      case Some(x) => println(Some(x)); x
      case None => println("None"); -1
    }

    println(mapPattern("hive"))
  }
}
