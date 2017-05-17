package com.yqc.controllerStatement

import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * Created by yangqc on 2017/5/17.
  */
class CatchException(n: Int) {

  val half =
    if (n % 2 == 0)
      n / 2
    else
      throw new RuntimeException("n must be even")
  /**
    * Scala不需要捕获checked exception
    */
  try {
    val f = new FileReader("input.txt")
  } catch {
    case ex: FileNotFoundException => println("file not found!")
    case ex: IOException => println("io exception!")
  }
}

object CatchException {

  def apply(n: Int): CatchException = new CatchException(n)

  def main(args: Array[String]): Unit = {
    println(CatchException(4).half)
    println(CatchException(3).half)
  }
}
