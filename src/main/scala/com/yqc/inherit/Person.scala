package com.yqc.inherit

/**
  * Created by yangqc on 2017/4/19.
  * 简单继承
  */
class Person(name: String, age: Int) {
  println("Constructing Person!")

  def walk(): Unit = println("walk like a normal person!")
}

class Student(name: String, age: Int, var studentNode: String) extends Person(name, age) {

  println("Constructing Student!")

  override def walk(): Unit = {
    super.walk()
    println("walk like a elegant swan!")
  }

  override def toString: String = {
    return "name:" + name + ",age:" + age + ",studentNode:" + studentNode
  }
}

abstract class Fruit(var name: String, var age: Int) {
  def showName: Unit
}

object demo_1 {
  def main(args: Array[String]): Unit = {
    /**
      * 构造Student之前，首先会调用Person的构造函数
      */
    val student = new Student("john", 18, "1024")
    println(student)
    student.walk()

    new Fruit("apple", 21) {
      override def showName: Unit = {
        println("name is:" + this.name + ", age is " + this.age)
      }
    }.showName
  }
}
