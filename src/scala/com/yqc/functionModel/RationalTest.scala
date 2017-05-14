package com.yqc.functionModel

/**
  * Created by yangqc on 2017/5/15.
  */
object RationalTest {
  def main(args: Array[String]): Unit = {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    println(oneHalf add twoThirds)

    //Scala操作符有自定义的顺序
    println(new Rational(2, 3) + new Rational(1, 3) * new Rational(1, 3))
    println(2 * new Rational(2, 3))

  }
}
