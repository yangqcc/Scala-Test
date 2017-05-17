package com.yqc.controllerStatement

import java.io.{FileNotFoundException, FileReader, IOException}
import java.net.{MalformedURLException, URL}

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
    val file = new FileReader("input.txt")
  } catch {
    case ex: FileNotFoundException => println("file not found!")
    case ex: IOException => println("io exception!")
  }
}

object CatchException {

  def apply(n: Int): CatchException = new CatchException(n)

  /**
    * Scala的try语句也会产生值
    *
    * @param path
    * @return
    */
  def urlFor(path: String) =
    try {
      new URL(path)
    } catch {
      case e: MalformedURLException => new URL("http://www.baidu.com")
    }

  def f: Int = try {
    return 1
  } finally {
    return 2
  }

  def g: Int = try {
    1
  } finally {
    2
  }

  def main(args: Array[String]): Unit = {
    /*  println(CatchException(4).half)
      println(CatchException(3).half)*/
    println(f)
    println(g)
  }
}
