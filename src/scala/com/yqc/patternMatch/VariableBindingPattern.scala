package com.yqc.patternMatch

/**
  * Created by yangqc on 2017/4/29.
  *
  * 变量绑定
  */
object VariableBindingPattern {
  def main(args: Array[String]): Unit = {
    val t = List(List(1, 2, 3), List(2, 3, 4))
    val studentLit = List(Student("yangqc", 12, 3))

    def variableBindingPattern(t: Any) = t match {
      //变量绑定，采用变量名（这里是e)
      //与@符号，如果后面的模式匹配成功，则将
      //整体匹配结果作为返回
      case List(_, e@List(_, _, _)) => e
      case List(s@Student(name, age, studentNo)) => (name, age, studentNo)
      case _ => Nil
    }

    println(variableBindingPattern(t))
    println(variableBindingPattern(studentLit))
  }
}
