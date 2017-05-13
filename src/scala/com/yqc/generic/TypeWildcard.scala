package com.yqc.generic

/**
  * Created by yangqc on 2017/5/13.
  * 类型通配符在使用类的时候使用,泛型在类定义时使用
  */
class Person(val name: String) {
  override def toString: String = name
}

class Student(name: String) extends Person(name)

class Teacher(name: String) extends Person(name)

class Pair[T](val first: T, val second: T) {
  override def toString: String = "first:" + first + " ,second:" + second
}

object TypeWildcard {
  //Pair的类型参数限定为[_<:Person]，即输入的类为Person及其子类
  //类型通配符和一般的泛型定义不一样，泛型在类定义时使用，而类型能配符号在使用类时使用
  def makeFriends(p: Pair[_ <: Person]) = {
    println(p.first + " is making friend with " + p.second)
  }

  def main(args: Array[String]): Unit = {
    makeFriends(new Pair[Person](new Student("john"), new Teacher("yangqc")))
  }

}
