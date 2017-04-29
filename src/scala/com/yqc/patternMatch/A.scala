package com.yqc.patternMatch

/**
  * Created by yangqc on 2017/4/29.
  */
sealed abstract class A

case class B(name: String, age: Int) extends A

case object CaseObject extends A {}
