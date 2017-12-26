import com.yqc.classAndObject.Utils
import com.yqc.xtwy.Teacher

/**
  * 太灵活了
  */
package com {
  package yqc {

    package classAndObject {

      object Utils {

        def toString(x: String): Unit = {
          println(x)
        }
      }

    }

    package xtwy {

      import com.yqc.classAndObject.Utils

      class Teacher(var name: String) {
        def printName() = {
          Utils.toString(name)
        }
      }

    }

  }

}

object appDemo {
  def main(args: Array[String]): Unit = {
    Utils.toString(new Teacher("Bob").name)
    new Teacher("john").printName()
  }
}
