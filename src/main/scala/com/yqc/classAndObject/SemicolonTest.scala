package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/5/13.
  * 输入跨越多行的的语句时,多数情况下无需特别处理,Scala将在争取的位置分割语句
  *
  * 不过最好还是规范化书写,避免造成些隐藏的bug
  * ===========分号推断规则===========
  * 1.疑问行有一个不能合法作为语句结束的字结束,如句点或中缀操作符
  * 2.下一行开始不能作为语句开始的词
  * 3.行结束语括号(...)或者[...]内部,因为这些符号不可能容纳多个语句
  */
class SemicolonTest {

}

object SemicolonTest {

  /**
    * 无需加分号,Scala将在正确的位置分割语句
    *
    * @param x
    */
  def method(x: Int): Unit = {
    if (x < 2)
      println("to small!")
    else
      println("ok!")
  }

  /**
    * 这样写法会吧x和+y当做两个语句,有两种解决方法
    * (1)加括号
    * (2)串接+号这样的操作符的时候,Scala的风格是吧操作符放在行尾而不是行头
    *
    * @param x
    * @param y
    * @return
    */
  def add(x: Int, y: Int) = {
    /*  x
      +y*/
    x +
      y
  }

  def main(args: Array[String]): Unit = {
    println(add(10, 20))
  }
}
