package com.yqc.patternMatch

import com.yqc.patternMatch.{Person => _}

/**
  * Created by yangqc on 2017/4/29.
  */
object ConstructorPattern {
  def main(args: Array[String]): Unit = {
    val p = Student("qicheng", 21, 29)

    def constructorPattern(p: Student) = p match {
      case Student(name, age, studentNo) => "Student"
      case _ => "other"
    }

    println(constructorPattern(p))
  }
}
