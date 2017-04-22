package com.yqc.traitTest

import java.io.PrintWriter

/**
  * Created by yangqc on 2017/4/23.
  *
  * trait构造顺序:
  * 1. 如果有超类，则先调用超类的构造器
  * 2. 如果有父trait，它会按照继承层次先调用父trait的构造器
  * 3. 如果有多个父trait，则按顺序从左到右执行
  * 4. 所有父类构造器和父trait被构造完之后，才会构造本类
  *
  * (*)trait有自己的构造器，它是无参构造器，不能定义trait带参数的构造器
  *
  * trait与普通的scala类并没有其它区别，
  * trait中可以有具体的、抽象的字段，也可以有具体的、抽象的方法，即使trait中没有抽象的方法也是合理的
  *
  * lazy方式定义fileOutput只有当真正被使用时才被初始化，例子中，
  * 当调用 s.log(“predifined variable “)时，fileOutput才被初始化，此时fileName已经被赋值了
  */
trait Logger {

  def log(msg: String): Unit
}

trait FileLogger extends Logger {


  val fileName: String

  //  val fileOutPut = new PrintWriter("file.log")

  lazy val fileOutPut = new PrintWriter(fileName: String)

  //定义懒加载变量,下面这条语句会报错,因为它FileLogger构造器里面的方法
  //在构造FileLogger的时候便会执行fileOutPut("#")
  //  fileOutPut.print("#")

  def log(msg: String): Unit = {
    fileOutPut.print(msg)
    fileOutPut.flush()
  }

}

class Person

class Student extends Person with FileLogger {
  override val fileName: String = "file.log"
}

object TraitDemo {
  def main(args: Array[String]): Unit = {
    //匿名类
    /*new FileLogger {
    }.log("trait demo")*/

    new Student().log("trait demo")
  }
}

