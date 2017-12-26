package com.yqc.traitTest.sip

/**
  * Created by yangqc on 2017/7/14.
  *
  * trait就像带有具体方法的java接口，不过可以做更多的事情，可以申明字段和维持状态值
  * **trait不能有任何类参数
  * trait被编译过后,就是java的抽象类
  */
trait Philosophical {
  def philosophize(): Unit = {
    println("this is philosophical!")
  }
}

class Animal(val name: String) extends Philosophical {
  self: Philosophical =>

  override def toString: String = "name is " + name;
}

class Frog(override val name: String) extends Animal(name) with Philosophical {

  override def toString: String = "this is Frog!"
}

object Frog {
  def apply(name: String): Frog = new Frog(name)

  def main(args: Array[String]): Unit = {
    Frog("Nicholas")

    def animal: Animal = new Animal("Dog")

    println(animal)
  }
}