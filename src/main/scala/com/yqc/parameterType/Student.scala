package com.yqc.parameterType

/**
  * Created by yangqc on 2017/4/20.
  * 在类上面进行参数限定
  */
case class Student[S, T <: AnyVal](var name: S, var hight: T)

object Object2 {
  def main(args: Array[String]): Unit = {
    val s2 = Student("john", 170.0)
    val s3 = Student("sss", 27L)
  }
}


