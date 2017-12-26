package com {
  package yqc {
    /**
      * 定义包太tm灵活了,不过尽量使用java包定义方式
      */

    import com.yqc.classAndObject.Teacher
    package classAndObject {

      abstract class Teacher(var name: String, var age: Int) {

        def showNameAndAge()
      }

    }

    class SmallTeacher(name: String, age: Int) extends Teacher(name, age) {
      override def showNameAndAge(): Unit = {
        println("name is " + name + ", age is " + age)
      }
    }

    object SmallTeacher {
      def apply(name: String, age: Int) = new SmallTeacher(name, age)

      def main(args: Array[String]): Unit = {
        SmallTeacher("Bob", 49).showNameAndAge()
      }
    }

  }

}
