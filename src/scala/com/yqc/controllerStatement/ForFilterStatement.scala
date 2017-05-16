package com.yqc.controllerStatement

/**
  * Created by yangqc on 2017/5/16.
  */
object ForFilterStatement {

  val filesHere = (new java.io.File(".")).listFiles()

  def showFilterName: Unit = {
    for (file <- filesHere if file.getName.endsWith(".scala"))
      println(file)
  }

  def showName2: Unit = {
    for (file <- filesHere
         if file.isFile;
         if file.getName.endsWith(".scala"))
      println(file)
  }

  def main(args: Array[String]): Unit = {
    showFilterName
  }
}
