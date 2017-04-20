package com.yqc.parameterType

/**
  * Created by yangqc on 2017/4/20.
  */
class TypeVariableBound {

  /**
    * 下面编译不通过，因为泛型T在编译时不能确定其具体的类型
    * 即并不是所有的类都存在compareTo方法
    *
    */
  /*def compare[T](first: T, second: T) = {
    if (first.compareTo(second) > 0) {
      first
    } else {
      second
    }
  }*/

  /**
    * 采用 <: 进行类型限定，该语法的意思是是泛型T必须是实现了Comparable接口的类型
    *
    * @param first
    * @param second
    * @tparam T
    * @return
    */
  def compare[T <: Comparable[T]](first: T, second: T) = {
    if (first.compareTo(second) > 0)
      first
    else
      second
  }

}

object TypeVariableBound {
  def main(args: Array[String]): Unit = {
    val tvb = new TypeVariableBound
    println(tvb.compare("A", "B"))
  }
}
