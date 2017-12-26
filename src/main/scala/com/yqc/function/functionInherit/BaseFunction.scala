package com.yqc.function.functionInherit

/**
  * Created by yangqc on 2017/7/17.
  *
  * 继承函数
  */
trait BaseFunction[-A, +B] extends (A => B)

object FunctionChild extends BaseFunction[Any, Unit] {

  override def apply(v1: Any): Unit = v1 match {
    case _: Int => println("Int")
    case _: Char => println("Char")
    case _: String => println("String")
    case _ => println("other")
  }
}

class FunctionClass extends BaseFunction[Int, Any] {
  override def apply(v1: Int): Any = v1 match {
    case _ => println(v1)
  }
}

object TestFunction {
  def main(args: Array[String]): Unit = {
    val myFunction1: BaseFunction[Any, Unit] = (x: Any) => println(x)
    val myFunction2: BaseFunction[Any, Unit] = FunctionChild
    val myFunction3: BaseFunction[Int, Any] = new FunctionClass
    myFunction1(12)
    myFunction2(12)
    myFunction3(12)
  }
}