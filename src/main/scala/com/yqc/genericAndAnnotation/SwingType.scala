package com.yqc.genericAndAnnotation

/**
  * Created by yangqc on 2017/4/30.
  *
  * 隐式转换
  * 1.当方法中的参数的类型与目标类型不一致时
  * 2.当对象调用类中不存在的方法或成员时，编译器会自动将对象进行隐式转换
  */
class SwingType {
  def wanLearned(sw: String) = println("兔子已经学会了" + sw)
}

object swimming {
  implicit def learningType(s: AnimalType) = new SwingType
}

class AnimalType

object AnimalType extends App {

  import com.yqc.genericAndAnnotation.swimming.learningType

  val rabbit = new AnimalType
  rabbit.wanLearned("breaststroke")
}