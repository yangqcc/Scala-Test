package com.yqc.patternMatch

/**
  * Created by yangqc on 2017/4/29.
  */
object PatternInForLoop {
  def main(args: Array[String]): Unit = {
    val m = Map("china" -> "beijing", "dwarf japan" -> "tokyo", "Aerican" -> "DC Washington")

    //利用for对Map进行匹配
    for ((nation, capital) <- m)
      println(nation + " : " + capital)
  }
}
