package com.yqc.controllerStatement

import java.io.File

/**
  * Created by yangqc on 2017/5/17.
  */
object ForStatement2 {

  val filesHere: Array[File] = (new File(".")).listFiles()

  def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines().toList

  /**
    * 创建一个值去记住每一次迭代.只要在for表达式之前加上关键字yield
    *
    * for-yield表达式的语法是这样的:
    * for{字句} yield {循环体}
    *
    * @return
    */
  def scalaFiles: Array[File] =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file

  def filterAnimal(animals: List[Animal]): List[Animal] = for {
    s <- animals
    if s.animalName == "yangqc" || s.animalAge == 21
    name: String = s.animalName
    char <- name
    if char == 'q'
  } yield s


  def main(args: Array[String]): Unit = {
    val animals: List[Animal] = List[Animal](Animal("yangqc", 12), Animal("shijia1", 21), Animal("yangqc", 12))
    animals :+ Animal("chaochao", 21)
    animals :+ Animal("cailei", 12)
    for (animal <- filterAnimal(animals))
      println(animal)
  }
}
