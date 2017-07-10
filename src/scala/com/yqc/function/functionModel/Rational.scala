package com.yqc.function.functionModel

/**
  * Created by yangqc on 2017/5/14.
  *
  * 有理数计算模型
  *
  * 不可变对象的唯一的缺点就是有时需要复制很大的对象表而可变对象的更新
  * 可以在原地址发生.所以有些情况下边的难以快速完成而可能产生性能瓶颈.
  * 所以要求功能库提供不可变类的可变版本也并不是意见稀奇的事情.
  *
  * ==Scala编译器把类内部的任何既不是字段也不是方法定义的代码编译至主构造器中
  *
  * ==主构造器之外的构造器称为辅助构造器,辅助构造器开始于def this(...)
  * 被调用的构造器即可以是朱构造器,也可以是源文件中早于调用构造器定义的其他辅助构造器.
  * 规则的根本结果就是每个Scala的构造器调用终将结束语对主构造器的调用.因此主构造器的类的
  * 唯一入口点.
  * ***Scala中,只有主构造器能够调用超类构造器
  **/
class Rational(n: Int, d: Int) {

  private val g = gcd(n.abs, d.abs)

  //加类型字段是为了外部对象能够访问
  val number: Int = n / g
  val denom: Int = d / g

  //require方法带一个布尔型参数.如果传入的值为真,require将正常返回.反之,require
  //将抛出IllegalArgumentException阻止对象被构造
  require(d != 0)

  def this(n: Int) = this(n, 1) //辅助构造器

  def add(that: Rational): Rational =
    new Rational(
      number * that.denom + that.number * denom,
      denom * that.denom
    )

  def +(that: Rational): Rational = toGcd(this.add(that));

  def +(i: Int): Rational = toGcd(new Rational(number + i * denom, denom))

  def -(that: Rational): Rational = new Rational(number * that.denom - denom * that.number, that.denom * denom)

  def -(i: Int): Rational = new Rational(number - i * denom, denom)

  def *(that: Rational): Rational = toGcd(new Rational(number * that.number, denom * that.denom))

  //判断是否小于传入的Rational
  def lessThan(that: Rational) = this.number * that.denom < this.number * this.denom

  def max(that: Rational) =
    if (this.lessThan(that))
      that
    else
      this

  private def toGcd(rational: Rational): Rational = {
    val g = gcd(rational.number, rational.denom)
    new Rational(rational.number / g, rational.denom / g)
  }

  private def gcd(a: Int, b: Int): Int =
    if (b == 0)
      a
    else
      gcd(b, a % b)

  override def toString = n + "/" + d

}

object Rational {

  //隐式转换函数
  implicit def intToRational(x: Int): Rational = new Rational(x)

}
