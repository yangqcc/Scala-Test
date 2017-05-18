package com.yqc.functionModel

/**
  * Created by yangqc on 2017/5/18.
  * Scala尽量避免循环带break或者continue
  */
object BreakAndContinue {

  def main(args: Array[String]): Unit = {
    /**
      * 不用while做循环的解决方法,使用递归代替循环
      *
      * @param i
      * @return
      */
    def searchFrom(i: Int): Int =
      if (i >= args.length) -1
      else if (args(i).startsWith("-")) searchFrom(i + 1)
      else if (args(i).endsWith(".scala")) i
      else searchFrom(i + 1)

    var i: Int = 0
    var foundIt: Boolean = false
    while (i < args.length && !foundIt) {
      if (!args(i).startsWith("-")) {
        if (args(i).endsWith(".scala"))
          foundIt = true
      }
      i = i + 1
    }
  }

}
