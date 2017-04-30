package com.yqc.genericAndAnnotation

/**
  * Created by yangqc on 2017/4/29.
  *
  * scala泛型
  */
class Person[T](var name: T)

class Student[T, S](name: T, age: S) extends Person(name)

object GenericDemo {
  def main(args: Array[String]): Unit = {
    println(new Student[String, Int]("Scala", 21).name)
  }
}
