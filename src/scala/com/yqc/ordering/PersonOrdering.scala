package com.yqc.ordering


/**
  * Created by yangqc on 2017/5/12.
  */
class PersonOrdering extends Ordering[Person] {

  override def compare(x: Person, y: Person): Int = {
    if (x.name > y.name)
      1
    else
      -1
  }
}

case class Person(val name: String) {
  println("正在构造对象:" + name)
}

object Person {

  def apply(name: String): Person = new Person(name)
}

class Pair[T: Ordering](val first: T, val second: T) {

  def smaller(implicit ord: Ordering[T]) = {
    if (ord.compare(first, second) > 0)
      first
    else
      second
  }
}

object ContextBound {
  def main(args: Array[String]): Unit = {
    implicit val p1 = new PersonOrdering
    val p = new Pair1[Person](Person("yangqc"), Person("超超"))
    println(p.smaller())
  }
}