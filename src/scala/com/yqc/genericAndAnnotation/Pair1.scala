package com.yqc.genericAndAnnotation

/**
  * Created by yangqc on 2017/4/30.
  */
class Pair1[T](val first: T, val second: T) {
  def replaceFirst[R >: T](newFirst: R) = new Pair1[R](newFirst, second)

  override def toString: String = first + "------" + second
}

class Book(val name: String) {
  override def toString: String = "name--" + name
}

class Ebook(name: String) extends Book(name)

class Pbook(name: String) extends Book(name)

class WeirdBook(name: String) extends Pbook(name)

object LowerBound {
  val eBook = new Ebook("hello")
  val pBook = new Pbook("paper book")

  val p1 = new Pair1(eBook, pBook)
  println(p1)

  val newFirst = new Book("generic pBook")
  val p2 = p1.replaceFirst(newFirst)
  println(p2)

  val weirdFirst: WeirdBook = new WeirdBook("generic pBook")
  val p3 = p1.replaceFirst(weirdFirst)

  val p4 = new Pair1(pBook, pBook)
  println(p4)

  val thirdBook = new Book("Super Books")
  val p5 = p4.replaceFirst(thirdBook)
  println(p5)

  //下面类型超出下界,所以会报错
  //  val p6: Pbook = p4.replaceFirst(weirdFirst)
}
