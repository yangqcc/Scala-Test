package com.yqc.test

/**
  * Created by yangqc on 2017/4/16.
  * test scala variable
  */
class TestVar {
  //var是变量
  var myVar: String = "Foo"
  //val是常量
  val staticVar: Int = 12

  def showString: String = {
    return myVar
  }

  //不返回任何数据的为Unit
  def showVariable: Unit = {
    myVar = "newVariable"
    //    staticVar = 12;  常量不能再次进行赋值
  }

  def addInt(x: Int, y: Int): Int = {
    var sum: Int = 0
    sum = x + y
    return sum
  }
}

object TestVar {
  def main(args: Array[String]): Unit = {
    val testVar: TestVar = new TestVar()
    println(testVar.showString)
    println(testVar.addInt(1, 2))
  }
}