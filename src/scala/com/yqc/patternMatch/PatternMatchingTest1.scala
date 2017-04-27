package com.yqc.patternMatch

/**
  * Created by yangqc on 2017/4/27.
  *
  * 模式匹配
  *
  */
object PatternMatchingTest1 {

  //case _表示除了 case 10,case 50,case 80的其余匹配，类似于java中的default
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 100) {
      i match {
        case 10 => println(10)
        case 50 => println(50)
        case 80 => println(80)

        case _ =>
      }
    }

    println("===============================")

    for (i <- 1 to 100) {
      i match {
        case 10 => println(10)
        case 50 => println(50)
        case 80 => println(80)

        //增加守卫条件
        case _ if (i % 4 == 0) => println(i + ":能被4整除")
        case _ if (i % 3 == 0) => println(i + ":能被3整除")
        case _ =>
      }
    }
  }
}
