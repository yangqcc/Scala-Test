package com.yqc.`abstract`.chapater10

/**
  * Created by yangqc on 2017/8/6
  *
  * Element添加宽度和高度
  */
abstract class Element {

  def contents: Array[String]

  def height: Int = contents.length

  def width: Int = if (height == 0) 0 else contents(0).length
}
