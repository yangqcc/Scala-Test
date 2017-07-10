package com.yqc.patternMatch

/**
  * Created by yangqc on 2017/4/28.
  *
  * 变量匹配模式
  */
object VariablePattern {
  def main(args: Array[String]): Unit = {
    def patternShow(x: Any) = x match {
      case 5 => "five"
      //所有不是值为5的都会匹配变量y
      //例如"xxx"，则函数的返回结果就是"xxx"
      //但我觉得 14 行的处理更好
      //      case y => y
      case _ => x
    }

    println(patternShow("qichang"))
  }
}
