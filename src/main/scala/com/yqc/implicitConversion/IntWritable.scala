package com.yqc.implicitConversion

/**
  * 发生类型不匹配的函数调用时
  * scala会尝试进行类型隐式转换首先优先进行函数参数的类型转换
  * 如果可以转换
  * 那么就完成函数的执行 否则尝试去对函数调用对象的类型进行转换 如果两个尝试都失败了
  * 就会报方法不存在或者类型不匹配的错误
  *
  * (1)先进行函数参数的类型转换
  * (2)再进行函数调用对象的类型进行转换
  */
class IntWritable(val _value: Int) {
  def value = _value

  def +(that: IntWritable): IntWritable = {
    new IntWritable(that.value + value)
  }

  override def toString: String = "value is : " + value
}

object IntWritable {
  implicit def intToWritable(int: Int) = new IntWritable(int)

  implicit def writableToInt(writable: IntWritable) = writable.value
}

object IntWritableTest {
  def main(args: Array[String]): Unit = {
    //结果是int类型
    println((10 + new IntWritable(20)).getClass)
    //这里结果是IntWritable类型
    println((new IntWritable(10) + 1).getClass)
  }
}
