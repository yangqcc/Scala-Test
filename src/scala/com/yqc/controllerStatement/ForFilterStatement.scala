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

  def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines().toList

  /**
    * 嵌套枚举,使用花括号代替小括号,这样可以省略小括号是必须加上的分号
    *
    * @param pattern
    */
  def grep(pattern: String) =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      if line.trim.matches(pattern)
    } println(file + ": " + line.trim)

  def main(args: Array[String]): Unit = {
    showFilterName
    grep(".*gcd.*")
  }
}
