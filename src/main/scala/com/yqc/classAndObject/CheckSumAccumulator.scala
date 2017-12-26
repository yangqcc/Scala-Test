package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/5/13.
  *
  * Scala里把成员公开的方法是不显示的制定任何访问修饰符。
  * java里面要写上"public"的地方,在scala里面就什么都不要写,public
  * 是Scala默认访问级别
  */
class CheckSumAccumulator {
  /**
    * Scala中如果仅计算单个结果表达式,如果结果很短,甚至可以把它放在def的同一行
    */

  private var sum = 0

  def add(b: Byte): Unit = sum += b

  def checkSum(): Int = ~(sum & 0xff) + 1

  /**
    * 对于结果类型为Unit的方法来说,执行的目的就是为了它的副作用,
    * 它的另一种表达方式就是去掉结果类型和等号,把方法体放在或括号里面
    *
    * @param b
    */
  def subtraction(b: Byte) = {
    sum -= b
  }

}

object TestObject {

  /**
    * 带花括号但是没有等号的,本质上会被当做Unit结果类型方法
    */
  def g() {
    "this String gets lost too!"
  }

  /**
    * 想要返回需要的结果,那么一定要记得加等号
    *
    * @return
    */
  def h() = {
    "this String gets returned!"
  }

  def main(args: Array[String]): Unit = {
    println(g())
    println(h())
  }
}
