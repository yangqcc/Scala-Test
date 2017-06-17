package scalaprogram.chapater10

/**
  * Created by yangqc on 2017/6/17.
  *
  * 一个方法只要没有实现(既没有等号或者方法体),它就是抽象的,方法的声明中不需要(也不允许)有抽象修饰符
  * 拥有实现的方法被称为具体方法
  *
  * scala不带参数时可以省略括号
  * 但是无论是直接还是非直接的使用可变对象，都应该添加空括号。这种方式是让参数扮演一个可见的线索来说明促发了某些有趣的计算
  */
abstract class Element {

  def contents: Array[String]

  /**
    * 高度
    *
    * @return
    */
  def height: Int = contents.length

  /**
    * 宽度
    *
    * @return
    */
  def width: Int = if (height == 0) 0 else contents(0).length
}
