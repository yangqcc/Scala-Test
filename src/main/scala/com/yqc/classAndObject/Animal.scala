package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/4/22.
  * 伴生类与伴生对象之间可以相互访问到对主的成员包括私有的成员变量或方法
  */
class Animal(var name: String, var age: Int) {
  private var sex: Int = 0

  def printCompanionObject = println(Animal.animalNo)
}

object Animal {
  private var animalNo: Int = 0

  def uniqueStudentNo() = {
    animalNo += 1
    animalNo
  }

  //自定义apply方法
  def apply(name: String, age: Int) = new Animal(name, age)

  def main(args: Array[String]): Unit = {
    println(Animal.uniqueStudentNo())
    val animal = Animal("john", 29)
    //直接访问Animal中的私有成员
    println(animal.sex)

    //直接利用类名进行对象的创建，这种方式实际上是调用前面的apply方法进行实现，这种方式的好处是避免了自己手动new去创建对象
    val animal2 = Animal("Nicholas", 30)
    println(animal2.age)
    println(animal2.name)
  }
}
