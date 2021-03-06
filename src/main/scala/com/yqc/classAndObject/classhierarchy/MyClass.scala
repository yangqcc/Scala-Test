package com.yqc.classAndObject.classhierarchy

/**
  * 继承函数
  *
  * Created by yangqc on 2017/7/14.
  */
trait FunctionMy[-A, +B] extends (A => B) {
  def apply(v1: A): B
}

class FunctionChild extends FunctionMy[Any, Unit] {
  override def apply(v1: Any): Unit = v1 match {
    case _: Int => println("Int")
    case _: Char => println("Char")
    case _: String => println("String")
    case _ => println("other")
  }
}

class MyClass(val name: String)(val age: Int)(val address: FunctionMy[Int, AnyRef]) {
  self =>

  override def toString: String = "name:" + self.name + ", age:" + self.age + ", address:" + self.address

  def showName: AnyRef = name
}

class Animal(override val name: String, override val age: Int, override val address: FunctionMy[Int, AnyRef] = (x: Int) => x.toString) extends MyClass(name)(age)(address) {

}

object MyClass {

  def apply(name: String)(age: Int)(address: FunctionMy[Int, AnyRef]): MyClass = new MyClass(name)(age)(address)

  def main(args: Array[String]): Unit = {

    val partialFunction: PartialFunction[Int, AnyRef] = {
      case _: Int => "int"
      case _ => "nothing"
    }

    val functionChild: FunctionMy[Any, Unit] = (x: Any) => println(x)
    val myFunction: FunctionMy[Int, AnyRef] = (age: Int) => new Animal("animal", age)
    val myClass = MyClass("期成")(32)(myFunction)
    println(myClass.address(12))
    println(myClass.showName)
  }
}
