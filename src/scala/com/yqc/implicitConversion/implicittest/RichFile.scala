package com.yqc.implicitConversion.implicittest

import java.io.File

import scala.io.Source

class RichFile(val file: File) {

  def read = Source.fromFile(file).getLines().mkString
}

object ImplicitFunction {

  /**
    * 引入隐式函数
    */
  //TODO
  def main(args: Array[String]): Unit = {
    /* var x: Int = 3.5
     val f = new File("C:\\Users\\yangqc\\IdeaProjects\\akka-test\\src\\main\\resource\\file.log").read
     println(f)*/
  }

}

object ImplicitConversion {

  implicit def double2Int(x: Double) = x.toInt

  implicit def file2RichFile(file: File) = new RichFile(file)
}


