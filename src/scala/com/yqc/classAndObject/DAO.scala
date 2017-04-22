package com.yqc.classAndObject

/**
  * Created by yangqc on 2017/4/22.
  *
  * 在scala的trait中，它不但可以包括抽象方法还可以包含字段和具体方法
  * 带有具体实现的trait是通过java中的抽象类来实现的
  * trait 特征
  */
trait DAO {

  //带具体字段
  var recodeMount: Long = 0x16

  //trait中,可以有具体方法
  def delete(id: String): Boolean = {
    println("delete implementation")
    true
  }

  def add(o: Any): Boolean

  def update(o: Any): Int

  def query(id: String): List[Any]
}

/**
  * 继承多个trait
  */
class DaoImpl extends DAO with Cloneable {

  override def delete(id: String): Boolean = true

  def add(o: Any): Boolean = true

  def update(o: Any): Int = 1

  def query(id: String): List[Any] = List(1, 2, 3)
}
