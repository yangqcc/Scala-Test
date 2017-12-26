package com.yqc.classAndObject.apply

/**
  * Created by yangqc on 2017/7/18.
  *
  * 用括号传递给变量(对象)一个或多个参数时，Scala 会把它转换成对 apply 方法的调用；
  * 与此相似的，当对带有括号并包括一到若干参数的进行赋值时，
  * 编译器将使用对象的 update 方法对括号里的参数和等号右边的对象执行调用。
  */
class SomeClass(val name: String) {

  def apply(key: String): String = {
    println("apply method called,key is: " + key)
    "Hello World!"
  }

}

object SomeClass {

  def apply(name: String): SomeClass = new SomeClass(name)

  def apply(name: String, age: Int): String = "name is " + name + " and age is " + age

  def main(args: Array[String]): Unit = {
    val anyObject = new SomeClass("Nicholas")
    println(anyObject("CustomKey"))
    println(SomeClass("Nicholas"))
    println(SomeClass("shijia", 12))
  }
}
