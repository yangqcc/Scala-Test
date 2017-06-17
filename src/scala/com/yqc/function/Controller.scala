package com.yqc.function

/**
  * Created by yangqc on 2017/6/17.
  */
object Controller {

  /*
    def withPrintWriter(file: File)(op: PrintWriter => Unit): Unit = {
      val writer = new PrintWriter(file)
      try {
        op(writer)
      } finally {
        writer.close();
      }
    }
  */

  var assertionsEnabled = true;

  def myAssert(predicate: () => Boolean) =
    if (assertionsEnabled && !predicate()) {
      throw new AssertionError
    }

  //上面函数的正确使用方式
  myAssert(() => 5 > 3)
}
