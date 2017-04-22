package com.yqc.packagetest

//HashMap便隐藏起来了
import java.util.{HashMap => _}

import scala.collection.mutable

/**
  * Created by yangqc on 2017/4/22.
  *
  * scala 类隐藏
  */
object ClassHide {

  def main(args: Array[String]): Unit = {
    val scalaHashMap = new mutable.HashMap[String, String]
    scalaHashMap.put("Spark", "excellent")
    scalaHashMap.put("MapReduce", "good")
    scalaHashMap.foreach(e => {
      val (k, v) = e
      println(k + ":" + v)
    })
  }
}
