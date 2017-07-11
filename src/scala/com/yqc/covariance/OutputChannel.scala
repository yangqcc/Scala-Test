package com.yqc.covariance

/**
  * Created by yangqc on 2017/7/11.
  */
class Animal {
  override def toString: String = "this is animal!"
}

class Dog extends Animal {

  def showDogName = "this is dog!"

  override def toString(): String = "this is Dog!"
}

class Cat extends Dog {

  def showCatName = "this is cat!"

  override def toString(): String = "this is Cat!"
}

class Pig extends Cat {

  def showPigName = "this is pig!"

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

  }
}