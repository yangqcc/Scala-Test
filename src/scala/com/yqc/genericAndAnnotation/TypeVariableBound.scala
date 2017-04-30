package com.yqc.genericAndAnnotation

/**
  * Created by yangqc on 2017/4/30.
  * 泛型限定
  */
class TypeVariableBound {
  def compare[T <: Comparable[T]](first: T, second: T) = {
    if (first.compareTo(second) > 0)
      first
    else
      second
  }
}

object TypeVariableBound {
  def main(args: Array[String]): Unit = {
    val tvb = new TypeVariableBound
    println(tvb.compare("A", "B"))
  }
}
