package com.yqc.traitTest

/**
  * Created by yangqc on 2017/4/23.
  */
class OuterClass {

  outer =>

  val v1 = "here"

  class InnerClass {
    //用outer表示外部类,相当于OuterClass.this
    println(outer.v1)
  }

}
