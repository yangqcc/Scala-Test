package com.yqc.controllerStatement

/**
  * Created by yangqc on 2017/5/17.
  */
class Animal(name: String, age: Int) {

  val animalName: String = name
  val animalAge: Int = age

  override def equals(obj: scala.Any): Boolean = {
    if (obj == null)
      false
    else if (!obj.isInstanceOf[Animal])
      false
    else {
      val otherObject: Animal = obj.asInstanceOf[Animal]
      if (this.age == otherObject.animalAge && this.name == otherObject.animalName)
        true
      else
        false
    }
  }

  override def toString: String = "name is '" + name + "' ,age is '" + age + "'"
}

object Animal {

  def apply(name: String, age: Int): Animal = new Animal(name, age)

  def main(args: Array[String]): Unit = {
    println(Animal("yangqc", 12) == Animal("yangqc", 21))
  }
}
