package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/5/3.
  *
  * 不带括号的函数,可以把函数当做一个变量
  */
class ApplyTest(val name: String) {

  def showName(applyTest: ApplyTest) = println(applyTest.name)

}

object ApplyTest {

  def apply(name: String): ApplyTest = new ApplyTest(name)

  def newApplyTest = new ApplyTest("yangqc")

  def main(args: Array[String]): Unit = {
    ApplyTest("chaochao").showName(ApplyTest.newApplyTest)
  }
}
