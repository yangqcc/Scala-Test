package com.yqc.covariance

/**
  * Created by yangqc on 2017/7/11.
  */
class Animal {
  override def toString: String = "this is animal!"
}

class Dog extends Animal {
  override def toString(): String = "this is Dog!"
}

class Cat extends Dog {
  override def toString(): String = "this is Cat!"
}

class Pig extends Cat {
  override def toString(): String = "this is Pig!"
}

class OutputChannel[-T] {

  /**
    * 使用T的子类U来替换T
    *
    * @param x
    * @tparam U
    */
  def write[U <: T](x: U): Unit = println(x)
}

class MyAnimal[+A] {

  def showName[U >: A](x: U) = println(x)
}

object Test {

  def main(args: Array[String]): Unit = {
    var outputChannel: OutputChannel[Dog] = new OutputChannel[Dog]
    outputChannel = new OutputChannel[Animal]
    outputChannel.write(new Cat)

    var myAnimal: MyAnimal[Cat] = new MyAnimal[Cat]
    myAnimal = new MyAnimal[Pig]
    myAnimal.showName(new Animal)
  }
}