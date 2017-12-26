package com.yqc.generic

/**
  * Created by yangqc on 2017/5/13.
  */
//用+标志泛型T,表示List类具有协变性
/*class List[+T](val head: T, val tail: List[T]) {
  //下面的方法编译会出错
  //covariant type T occurs in contravariant position in type T of value newHead
  //编译器提示协变类型T出现在逆变的位置
  //即泛型T定义为协变之后，泛型便不能直接
  //应用于成员方法当中
  //  def prepend(newHead: T): List[T] = new List(newHead, this)

  //将函数也用泛型表示
  //因为是协变的，输入的类型必须是T的超类
  def prepend[U >: T](newHead: U): List[U] = new List(newHead, this)
}

object NonVariance {
  def main(args: Array[String]): Unit = {
    val list: List[Any] = new List[String]("yangqc", null)
  }
}*/
