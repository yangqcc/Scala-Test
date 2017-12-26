package com.yqc.inherit

/**
  * Created by yangqc on 2017/4/19.
  * 多态和动态绑定
  */
abstract class Animal(var name: String, var age: Int) {

  def walk(): Unit

  def talkTo(p: Animal): Unit
}

class MyStudent(name: String, age: Int) extends Animal(name, age) {

  private var studentNo: Int = 0

  def walk(): Unit = println("walk like a elegant swan!")

  override def talkTo(animal: Animal) = {
    println("talkTo() method in Student")
    println(this.name + " is talking to " + animal.name)
  }

}

class MyTeacher(name: String, age: Int) extends Animal(name, age) {

  private var teacherNo: Int = 0

  override def walk(): Unit = println("walk like a elegant swan!")

  override def talkTo(p: Animal): Unit = {
    println("talkTo() method in Teacher!")
    println(this.name + " is talking to " + p.name)
  }
}

object demo_2 {
  def main(args: Array[String]): Unit = {

    /**
      * 多态的使用,Animal类的引用可以指向Animal类的任何子类
      */
    val p1: Animal = new MyTeacher("John", 29)
    val p2: Animal = new MyStudent("Nicholas", 50)

    //下面的两行代码演示了动态绑定
    //talkTo方法参数类型为Person类型
    //p1.talkTo(p2)传入的实际类型是Student
    //p2.talkTo(p1)传入的实际类型是Teacher
    //程序会根据实际类型调用对应的不同子类中的talkTo()方法
    p1.talkTo(p2)
    p2.talkTo(p1)
  }
}
