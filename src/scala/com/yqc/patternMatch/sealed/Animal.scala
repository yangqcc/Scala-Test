package com.yqc.patternMatch.`sealed`

/**
  * Created by yangqc on 2017/4/29.
  *
  * sealed 关键字表示，其修饰的trait只能在当前文件里头被继承
  */
sealed abstract class Animal

case class Dog(name: String, age: Int) extends Animal

case class Cat(name: String, age: Int) extends Animal

object testSealed {
  def main(args: Array[String]): Unit = {

    val animal: Animal = Dog("guaiguai", 21)

    def showName(animal: Animal) = animal match {
      case Dog(name, age) => println(name)
      case Cat(name, age) => println(age)
      case _ => println("no match!")
    }

    showName(animal)
  }
}
