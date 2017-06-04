package com.yqc.function

/**
  * Created by yangqc on 2017/5/24.
  */
object RepeatedParameter {

  /**
    * 允许客户向函数传入可变长度参数列表,标注一个重复参数,可在参数的类型之后放一个星号
    * echo函数里被声明为类型"String*"的args的类型实际上是Array[String]
    *
    * @param args
    */
  def echo(args: String*) = for (arg <- args) print(arg)

  def main(args: Array[String]): Unit = {
    echo("hello", " ", "scala", "!")
    val arr = Array("What's", "up", "doc?")
    //    echo(arr)  //这句会报错,需要改成下面那句

    //这里告诉编译器,把数组的每个元素当做参数
    //TODO 数组每个元素当做你参数
    echo(arr: _*)
  }
}
