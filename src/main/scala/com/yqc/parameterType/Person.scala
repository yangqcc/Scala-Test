package com.yqc.parameterType

/**
  * Created by yangqc on 2017/4/20.
  */
case class Person(var name: String, var age: Int) extends Comparable[Person] {

  override def compareTo(o: Person): Int = {
    if (this.age > o.age) 1
    else if (this.age == o.age) 0
    else -1
  }

}

class TypeVariable {
  def compare[T <: Comparable[T]](first: T, second: T) = {
    if (first.compareTo(second) > 0)
      first
    else
      second
  }
}

object Object1 {
  def main(args: Array[String]): Unit = {
    val tvb = new TypeVariable
    println(tvb.compare("A", "B"))
    println(tvb.compare(Person("stephen", 19), Person("john", 20)))
  }
}
