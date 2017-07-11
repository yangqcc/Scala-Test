package com.yqc.covariance

/**
  * Created by yangqc on 2017/7/11.
  */
class MyClass[-A, +B]

class MyClassChild[A, B] extends MyClass[AnyVal, Unit] {

  def myFunction(x: Int): Any => Unit = x => x.toString
}
