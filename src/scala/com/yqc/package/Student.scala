package com.yqc.`package`

/**
  * Created by yangqc on 2017/4/22.
  *
  * 在scala中没有public关键字，仅有private 和 protected访问控制符，当一个类成员不加private和protected时，它的访问权限就是public
  */
class Student(var name: String, var age: Int) {

  private var sex: Int = 0

  class Course(val cName: String, val gpa: Float) {
    def getStudentSex(student: Student) = student.sex
  }

}

class Class {

  //下面这条语句不通过,因为sex是私有的
  //  def getStudentSex(student: Student)=student.sex
}

object Student {

  private var studentNo: Int = 0

  def uniqueStudentNo() = {
    studentNo += 1
    studentNo
  }

  def apply(name: String, age: Int) = new Student(name, age)

  def main(args: Array[String]): Unit = {
    println(Student.uniqueStudentNo())
    val s = new Student("john", 12)

    //访问伴生类中的私有成员
    println(s.sex)

    val s1 = new Student("Scala", 28)
    println(s1.sex)
    println(s1.name)

    //使用内部类
    val c1 = new s1.Course("Scala", 2.0f)
    println(c1.getStudentSex(Student("Nicholas", 70)))
  }
}

object MyStudent {
  def main(args: Array[String]): Unit = {
    println(Student.uniqueStudentNo())
    val s = new Student("john", 12)

    //访问伴生类中的私有成员
    //    println(s.sex)

    val s1 = new Student("Scala", 28)
    //非伴生对象，所以不能访问私有成员
    //    println(s1.sex)
    println(s1.name)

    //使用内部类
    val c1 = new s1.Course("Scala", 2.0f)
    println(c1.getStudentSex(Student("Nicholas", 70)))
  }
}
