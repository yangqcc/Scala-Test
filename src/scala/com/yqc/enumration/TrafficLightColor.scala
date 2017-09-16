package com.yqc.enumration

/**
  * Created by yangqc on 2017/9/7
  */
object TrafficLightColor extends Enumeration {
  type TrafficLightColor = Value

  val Red = Value(0, "stop")
  val Yellow = Value(10)
  val Green = Value("Go")
}
