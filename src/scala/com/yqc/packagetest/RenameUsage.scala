package com.yqc.packagetest

import java.util.{HashMap => JavaHashMap, Map => JavaMap}

import scala.collection.mutable.HashMap

/**
  * Created by yangqc on 2017/4/22.
  * 可以修改引入类的类名
  */
object RenameUsage {
  def main(args: Array[String]): Unit = {
    val javaHashMap = new JavaHashMap[String, String]()
    javaHashMap.put("Spark", "excellent")
    javaHashMap.put("MapReduce", "good")
    //scala不支持遍历JavaHashMap.keySet
    for (key <- javaHashMap.keySet().toArray())
      println(key)

    val scalaHashMap = new HashMap[String, String]
    scalaHashMap.put("Spark", "excellent")
    scalaHashMap.put("MapReduce", "good")

    scalaHashMap.foreach(e => {
      val (k, v) = e
      println(k + ":" + v)
    })
  }
}
