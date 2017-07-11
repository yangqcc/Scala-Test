package com.yqc.covariance

/**
  * Created by yangqc on 2017/7/11.
  */

class OutputChannel[-T] {

  /**
    * 使用T的子类U来替换T
    *
    * @param x
    * @tparam U
    */
  def write[U <: T](x: U): Unit = println(x)
}

class ChildClass extends OutputChannel[Any] {
  /**
    * 使用T的子类U来替换T
    *
    * @param x
    * @tparam U
    */
  override def write[U <: Any](x: U): Unit = println(x)
}

object Test {
  def main(args: Array[String]): Unit = {
    var outputChannel: OutputChannel[Any] = new OutputChannel[Any]
    outputChannel = new ChildClass
    outputChannel.write("qicheng")
  }
}