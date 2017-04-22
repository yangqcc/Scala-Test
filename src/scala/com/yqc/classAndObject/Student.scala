package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/4/21.
  *
  * 单例对象创建方式
  */
object Student {
  private var studentNo: Int = 0

  def uniqueStudentNo() = {
    studentNo += 1
    studentNo
  }

  def main(args: Array[String]): Unit = {
    println(Student.uniqueStudentNo())
  }
}
