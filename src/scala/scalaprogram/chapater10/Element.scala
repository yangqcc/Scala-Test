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

  def above(that: Element): Element = new ArrayElement(this.contents ++ this.contents)

  def beside(that: Element): Element = {
    val contents = new Array[String](this.contents.length)
    for (i <- 0 until this.contents.length) {
      contents(i) = this.contents(i) + that.contents(i)
    }
    new ArrayElement(contents);
  }

  /**
    * 和beside实现相同的功能
    *
    * @param that
    * @return
    */
  def beside2(that: Element): Element = {
    new ArrayElement(for ((line1, line2) <- this.contents zip that.contents) yield line1 + line2)
  }

  /**
    * 真tm简洁
    */
  val tuples = Array(("12", "14"))

  def multipleTuple: Array[String] = for ((line1, line2) <- tuples) yield line1 + line2

  override def toString: String = contents mkString "\n"

}

object Element {

  /**
    * 工厂方法
    *
    * @param contents
    * @return
    */
  def elem(contents: Array[String]): Element = new ArrayElement(contents)
}

object Test {
  def main(args: Array[String]): Unit = {
    for (line <- new Element {
      override def contents: Array[String] = Array("12");
    }.multipleTuple) {
      print(line)
    }
  }
}
