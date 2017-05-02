package com.yqc.implicitConversion

/**
  * Created by yangqc on 2017/5/2.
  *
  * 可以引入新的语法
  */
class Rational[A <: Int](y: A) {

  def $[B <: Int](x: B): Int = x * y

}

object Rational {

  implicit def int2Rational[A <: Int](x: A): Rational[A] = new Rational[A](x)
}

object converterOperator {

  import com.yqc.implicitConversion.Rational.int2Rational

  def main(args: Array[String]): Unit = {

    val x: Int = 19
    val y: Int = 10

    println(x $ y)
  }
}
