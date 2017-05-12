package com.yqc.ordering

/**
  * Created by yangqc on 2017/5/12.
  */
class Student(val name: String) extends Ordered[Student] {

  override def compare(that: Student): Int = {
    if (this.name == that.name)
      1
    else
      -1
  }

  override def toString: String = name

}

object Student {
  def apply(name: String): Student = new Student(name)
}

class Pair1[T <: Ordered[T]](val first: T, val second: T) {

  def smaller() = {
    if (first < second)
      first
    else
      second
  }
}

object OrderedViewBound {

  def main(args: Array[String]): Unit = {
    val p = new Pair1[Student](Student("yangqc"), Student("chaochao"))
    println(p.smaller())
  }
}