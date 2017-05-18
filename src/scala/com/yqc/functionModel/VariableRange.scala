package com.yqc.functionModel

/**
  * Created by yangqc on 2017/5/18.
  */
object VariableRange {

  def printMultiTable(): Unit = {
    var i = 1
    while (i <= 10) {
      var j = 1

      //这里i和j在范围内
      while (j <= 10) {
        val prod = (i * j).toString

        var k = prod.length

        while (k < 4) {
          print(" ")
          k += 1
        }
        print(prod)
        j += 1
      }

      //i和j仍在范围内:prod和k脱离范围
      println()
      i += 1
    }
    //i仍然在范围内,j,prod和k脱离范围
  }

}
