package com.yqc.variable

class Navigator {

  private[variable] class InnerClass {
    private[this] var speed = 200
    protected[InnerClass] var name = "this is name"

    private[variable] class LegOfJourney {
      private[Navigator] val distance = 100

      def showName = {
        println(name)
      }
    }

  }

  class NavigatorInnerClass(val name: String)

}

object Navigator {

  def apply: Navigator = new Navigator()

  def main(args: Array[String]): Unit = {
    val navigator: Navigator = new Navigator()
    val innerClass: navigator.NavigatorInnerClass = new navigator.NavigatorInnerClass("Nicholas")
  }
}


