package com.yqc.collection.array

/**
  * Created by yangqc on 2017/5/2.
  * 语法太简洁了,我他妈好喜欢
  *
  * 方法只有一个参数,调用时可以省略点号和括号
  */
class ArrayTest2(val name: String) {

  var age: Int = 12

  def +(otherName: String): String = name + otherName

  def showName = println(name)

  def setAge(age: Int) = {
    this.age = age
    this
  }

  override def toString: String = {
    "name: " + name + ", age:" + age
  }
}

object ArrayTest2 {

  def apply(name: String): ArrayTest2 = new ArrayTest2(name)

  def main(args: Array[String]): Unit = {
    //下面两句意义相同,但是对于
    println(ArrayTest2("qicheng") + " love yanlu!")
    println(ArrayTest2("chaochao").+(" love qicheng!"))
    println(ArrayTest2("yangqc") setAge 12)
  }
}
