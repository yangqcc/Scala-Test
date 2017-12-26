package com.yqc.collection.list.filter

/**
  * Created by yangqc on 2017/8/19
  */
/*object FilterTest2 {

  def flattenLeft[T](xss: List[List[T]]) = (List[T] /: xss) ((x: List[T], x2: List[T]) => x ::: x2)

  def flattenRight[T](xss: List[List[T]]) = (xss :\ List[T]) (_ ::: _)

  def main(args: Array[String]): Unit = {

  }
}*/
object FilterTest2 {
  def showName(p: () => (Int, Int)) = println(p())

  def showAge(number: Int)(p: (Int, Int) => Unit) = p(number + 1, 22)

  def showHi(number: Int) = println(number)

  def main(args: Array[String]): Unit = {
    //showName里面是函数表达式,里面有返回值
    showAge(21)({
      println("this is interl showName")
      (x1, x2) => println(x1 + x2)
    })
  }
}