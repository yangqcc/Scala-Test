package com.yqc.operator

class Executive {
  private[society] var workDetails = null
  //      private[professionl] var friends: String = "my friends"
  private[this] var secrets = null
  private[Executive] var num: Int = 1

  private[society] def help(another: Executive): Unit = {
    println(another.workDetails)
    //        println(another.friends);
    //        println(another.secrets); //ERROR
  }
}

class Child extends Executive {
  override def help(another: Executive): Unit = {
    super.help(another)
    println("this is child class")
  }

  def childHelp: Unit = {
    println(workDetails)
    //        println(friends)
  }
}

class Fruit {
  def help: Unit = {
    println()
  }
}

object MyObject {
  def main(args: Array[String]): Unit = {
    new Child().help(new Executive())
  }
}
