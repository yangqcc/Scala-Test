package com.yqc.tailRecursive

/**
  * Created by yangqc on 2017/5/24.
  *
  * scala尾递归,尾递归由下往上,最后不必回溯到上一级
  */
object TrailRecursiveTest1 {

  def boom(x: Int): Int =
    if (x == 0) throw new Exception("boom!")
    else boom(x - 1) + 1

  /**
    * scala优化,实现了尾递归
    *
    * @param x
    * @return
    */
  def bang(x: Int): Int =
    if (x == 0) throw new Exception("bang!")
    else bang(x - 1)

  def main(args: Array[String]): Unit = {
    //    boom(10)
    bang(10)
  }
}
