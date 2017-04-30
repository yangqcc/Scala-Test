package com.yqc.genericAndAnnotation

/**
  * Created by yangqc on 2017/4/30.
  */
class SwingType {
  def wanLearned(sw: String) = println("兔子已经学会了" + sw)

  implicit def learningType(s: AnimalType) = new SwingType
}

object swimming {
  implicit def learningType(s: AnimalType) = new SwingType
}

class AnimalType

object AnimalType extends App {

  val rabbit = new AnimalType /////////////////////////////////////////////////
  rabbit.wanLearned("breaststroke")
}