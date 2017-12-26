package com.yqc.closure

/**
  * Created by yangqc on 2017/5/24.
  */
object ClosureTest1 {

  def makeIncreaser(more: Int) = (x: Int) => x + more

  val inc1 = makeIncreaser(1)

  def main(args: Array[String]): Unit = {

  }
}
