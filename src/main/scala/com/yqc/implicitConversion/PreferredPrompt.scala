package com.yqc.implicitConversion

/**
  * Created by yangqc on 2017/5/2.
  */
class PreferredPrompt(val preference: String)

class PreferredDrink(val preference: String)

object Greeter {

  def greet(name: String)(implicit prompt: PreferredPrompt): Unit = {
    println("Welcome, " + name + ". The system is ready.")
    println(prompt.preference)
  }

  def greet2(name: String)(implicit prompt: PreferredPrompt, drink: PreferredDrink): Unit = {
    println("Welcome, " + name + ". The system is ready.")
    println("But while you work.")
    println("why not enjoy a cup of" + drink.preference + "?")
    println(prompt.preference)
  }

  def maxListImpParam[T](elements: List[T])(implicit orderer: T => Ordered[T]): T = elements match {
    case List() => throw new IllegalArgumentException("empty list")
    case List(x) => x
    case x :: rest =>
      val maxRest = maxListImpParam(rest)
      if (orderer(x) > maxRest) x
      else maxRest
  }
}

object implicitVariable {

  import com.yqc.implicitConversion.JoesPrefs._

  //preferred被标记为隐式的,如果不是的话,编译器不能用它来补充参数的列表
  implicit val preferred: PreferredPrompt = new PreferredPrompt(">")

  def main(args: Array[String]): Unit = {
    Greeter.greet("yangqc")
    println("================================")
    Greeter.greet2("yanqc")(prompt, drink)
    println("================================")

    println(Greeter.maxListImpParam(List(1, 5, 10, 3)))
    println(Greeter.maxListImpParam(List(1.5, 5.2, 10.7, 3.14159)))
    println(Greeter.maxListImpParam(List("one", "two", "three")))
  }
}

object JoesPrefs {

  implicit val prompt = new PreferredPrompt("Yes, master>")

  implicit val drink = new PreferredDrink("tea")
}