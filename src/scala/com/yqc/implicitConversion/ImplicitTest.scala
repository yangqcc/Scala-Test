package com.yqc.implicitConversion

/**
  * Created by yangqc on 2017/5/2.
  */
object ImplicitTest {

  def getDogName(dog: Dog): String = dog.name

  def maxListValue[T <% Ordered[T]](list: List[T]): T =
    list match {
      case List() => throw new IllegalArgumentException("argument is empty!")
      case List(x) => x
      case x :: rest =>
        val maxValue = maxListValue(rest)
        if (x > maxValue) x
        else maxValue
    }

  def main(args: Array[String]): Unit = {

    val animal: Animal = Animal("this is animal!")

    val dogList: List[Dog] = List(new Dog("shijia", 12), new Dog("chaochao", 29))

    println(getDogName(animal))
    println(animal.getDogAge)
    println(maxListValue(dogList))
  }
}
