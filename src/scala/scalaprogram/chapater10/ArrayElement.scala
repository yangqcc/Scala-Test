package scalaprogram.chapater10

/**
  * Created by yangqc on 2017/6/17.
  * 继承如果省略了extends，Scala编译器将隐式地扩展自scala.AnyRef
  * Scala可以重写无参构造函数方法
  * Scala禁止同一个类中用同样的名称定义字段和方法
  *
  * **Scala只有两个命名空间:
  * 值(字段，方法，包还有单例对象)
  * 类型(类和特征名)
  */
class ArrayElement(conts: Array[String]) extends Element {

  override def contents: Array[String] = conts
}
