package com.yqc.collection.list

/**
  * map 和 flatMap的区别
  * Created by yangqc on 2017/8/17
  */
trait Parent {
  def showThis()
}

object ListMapAndFlatMap extends Parent {

  def showAge = (x: Int) => x.toString

  override def showThis() = ListMapAndFlatMap()

  def apply() = println("this is apply")

  implicit val a: Parent = ListMapAndFlatMap

  def showName(f: Parent => String)(implicit a: Parent) = println(f(a))

  def main(args: Array[String]): Unit = {
    val list: List[String] = List("nicholas", "bob", "mary", "lucy")
    println(list map (_.toList))
    println(list flatMap (_.toList))
    println(list map (_ + "l"))
    showName((x: Parent) => {
      x.showThis()
      "this is showName"
    })
    showAge(21)
  }
}
