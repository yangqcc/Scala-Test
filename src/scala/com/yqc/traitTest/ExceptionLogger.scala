package com.yqc.traitTest

/**
  * Created by yangqc on 2017/4/23.
  */
trait ExceptionLogger extends Exception with Logger {
  def log(msg: String): Unit = {
    println(getMessage)
  }
}
