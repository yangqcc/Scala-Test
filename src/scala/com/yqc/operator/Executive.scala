package com.yqc.operator

/**
  * 访问权限
  */
package society {

  class Executive {
    private[society] var workDetails: String = "this is workDetails"
    private[Executive] var friends: String = "my friends"
    private[society] var secrets: String = "this is secretes"

    private[society] def help(another: Executive): Unit = {
      println(another.workDetails)
      println(another.friends);
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
      //      println(friends)   //ERROR
    }
  }

  object MyObject {
    def main(args: Array[String]): Unit = {
      new Child().help(new Executive())
      new Executive().help(new Executive)
      println(new Executive().workDetails)
      println(new Executive().secrets)
    }
  }

}
