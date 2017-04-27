package com.yqc.patternMatch

/**
  * Created by yangqc on 2017/4/27.
  * 在进行模式匹配的时候，有些时候需要确保所有的可能情况都被列出，此时常常会将case class的超类定义为sealed（密封的) case class
  */
object PatternMatchingTest2 {
  def main(args: Array[String]): Unit = {
    val s: Person = Student("john", 18, 1024)

    //这边仅仅给出了匹配Student的情况，在编译时
    //编译器会提示
    //match may not be exhaustive. It would fail on the following inputs: Nobody(_), Teacher(_, _, _)

    s match {
      case Student(name, _, _) => println(name)
    }
  }
}
