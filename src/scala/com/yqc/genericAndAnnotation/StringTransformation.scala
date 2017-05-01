package com.yqc.genericAndAnnotation

/**
  * Created by yangqc on 2017/5/2.
  *
  * 隐式转换规则:
  * 标记规则：只有标记为implicit的定义才是可用的.implicit关键字被用来标记编译器
  * 可以用于隐式操作申明.你可以使用它标记任何变量,函数,或对象定义.
  *
  */
class StringTransformation {

  implicit def stringWrapper(x: Int) = x.toString
}
