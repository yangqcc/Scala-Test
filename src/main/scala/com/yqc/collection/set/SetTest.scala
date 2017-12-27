package com.yqc.collection.set

/**
  * Created by yangqc on 2017/5/6.
  */
object SetTest {
  def main(args: Array[String]): Unit = {
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))
  }
}
