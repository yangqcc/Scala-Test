package com.yqc.extractor

/**
  * Created by yangqc on 2017/7/18.
  */
class Person(val firstName: String, val secondName: String)

//在伴生对象中定义apply方法和unapply方法
object Person {

  def apply(firstName: String, secondName: String) = new Person(firstName, secondName)

  def unapply(person: Person): Option[(String, String)] = {
    if (person != null) Some(person.firstName, person.secondName)
    else None
  }
}

object TestExtractor extends App {
  val p = Person("摇摆少年梦", "周")
  p match {
    //析构出firstName，secondeName
    case Person(firstName, secondName) => println("firstName=" + firstName + " secondName=" + secondName)
    case _ => println("null object")
  }
}
