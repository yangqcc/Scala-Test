package com.yqc.implicitConversion

/**
  * Created by yangqc on 2017/5/2.
  */
class Animal(val name: String) {

  def showName = println(name)
}

class Dog(val name: String, val age: Int) extends Ordered[Dog] {

  def getDogAge: Int = age

  override def compare(that: Dog): Int = {
    name.compare(that.name)
  }

  override def toString: String = "name:" + name + ", age=" + age
}

object Animal {

  implicit def animalToDog(x: Animal) = new Dog(x.name, 20)

  def apply(name: String): Animal = new Animal(name)
}