package com.yqc.patternMatch

/**
  * Created by yangqc on 2017/4/27.
  *
  * Case Class, 样例类
  *
  * 1 构造器中的参数如果不被声明为var的话，它默认的话是val类型的，但一般不推荐将构造器中的参数声明为var
  * 2 自动创建伴生对象，同时在里面给我们实现子apply方法，使得我们在使用的时候可以不直接显示地new对象
  * 3 伴生对象中同样会帮我们实现unapply方法，从而可以将case class应用于模式匹配，关于unapply方法我们在后面的“提取器”那一节会重点讲解
  * 4 实现自己的toString、hashCode、copy、equals方法
  * 除此之此，case class与其它普通的scala类没有区别
  */
abstract class Person

case class Student(name: String, age: Int, studentNo: Int) extends Person

case class Teacher(name: String, age: Int, teacherNo: Int) extends Person

case class Nobody(name: String) extends Person

case class SchoolClass(classDescription: String, persons: Person*)

object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    val p: Person = Student("john", 18, 1024)
    val schoolClass = new SchoolClass("scala cource", p, Teacher("teacher", 21, 21))

    schoolClass match {
      /*case Student(name, age, studentNo) => println(name + " : " + age + " : " + studentNo)
      case Teacher(name, age, teacherNo) => println(name + " : " + age + " : " + teacherNo);
      case Nobody(name) => println(name)*/
      case SchoolClass(_, _, Student(name, age, studentNo)) => println(name)
      case _ => println("Nobody")
    }

    val student: Student = Student("yangqc", 21, 12)

    //copy() 是深度拷贝
    val student2: Student = student.copy()

    //一个参数的拷贝
    val student3 = student.copy(name = "wangshijia")

    //两个参数的拷贝
    val student4 = student.copy(name = "chaochao", age = 12)

    println(student == student2)
    println(student.eq(student2))
    println(student3)
    println(student4)
  }
}
