package com.yqc.controllerStatement

/**
  * Created by yangqc on 2017/5/17.
  */
class Animal(name: String, age: Int) {

  val animalName: String = name
  val animalAge: Int = age

  override def equals(obj: scala.Any): Boolean = {
    if (!obj.isInstanceOf[Animal])
      return false
    val otherObject: Animal = obj.asInstanceOf[Animal]
    if (this.age != otherObject.animalAge)
      return false;
    if (this.name != otherObject.animalName)
      return false;
    true;
  }

  override def toString: String = "name is '" + name + "' ,age is '" + age + "'"
}

object Animal {

  def apply(name: String, age: Int): Animal = new Animal(name, age)

  def main(args: Array[String]): Unit = {
    println(Animal("yangqc", 12) == "")
  }
}
