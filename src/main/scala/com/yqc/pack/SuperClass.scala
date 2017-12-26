package com.yqc.pack

/**
  * Created by yangqc on 2017/4/22.
  *
  * 在java语言中,protected成员不但可以被该类及其子类访问,也可以被同一个包中的其它类使用,
  * 但在scala中，protected成员只能被该类及其子类访问
  *
  * 无修饰符的成员同java 的public,可以在任何位置进行访问
  */
class SuperClass {
  protected def f() = println("...........")
}

class SubClass extends SuperClass {
  f()
}

class OtherClass {

  //下面语句会报错,即使是同一个包中的类,也不能访问protected成员
  //  f()
}

object OtherClass {
  def main(args: Array[String]): Unit = {
  }
}

//伴生对象可以访问protected成员
object SuperClass {
  def main(args: Array[String]): Unit = {
    new SuperClass().f()
  }
}
