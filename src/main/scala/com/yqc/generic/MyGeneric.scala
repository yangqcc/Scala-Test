package com.yqc.generic

/**
  * Created by yangqc on 2017/5/13.
  */
class MyTest[+Animal](val animal: Animal) {

  def showClass[U >: Animal](animal: U): Class[_ <: U] = animal.getClass;
}

class Animal(val name: String)

class Dog(override val name: String) extends Animal(name)

object MyGeneric {
  def main(args: Array[String]): Unit = {

  }
}
