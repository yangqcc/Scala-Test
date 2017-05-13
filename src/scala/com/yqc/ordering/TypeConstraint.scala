package com.yqc.ordering

/**
  * Created by yangqc on 2017/5/13.
  */
object TypeConstraint {
  def main(args: Array[String]): Unit = {
    def test[T](name: T)(implicit ev: T <:< java.io.Serializable) = name

    //正确，因为String类型属于Serializable的子类
    println(test("摇摆少年梦"))
    //错误，因为Int类型不属于Seriablizable的子类
    //    println(test(134))
  }
}
