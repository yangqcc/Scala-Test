package functionscala.chapter4

/**
  * 使用普通的值类表示失败和异常,将对错误处理和恢复的通用
  * 模式抽象出来用函数实现.Option不是用于这种目的得唯一数据类型,
  * 使用很频繁,但是过于简单,Option不会告诉我们在异常条件下发生什么
  * 错误,它只是给我们一个None,表示没有可用的值.
  * Created by yangqc on 2018/2/19.
  */
class ConvertString {

  def insuranceRateQuote(age: Int, numberOfSpeedingTickets: Int): Double = {
    age + numberOfSpeedingTickets
  }

  /**
    * 不选择修改{@link insuranceRateQuote},而是选择提升函数
    *
    * @param a
    * @param b
    * @param f
    * @tparam A
    * @tparam B
    * @tparam C
    * @return
    */
  def map2[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] = Some(f(a.get, b.get))

  /**
    * 上面 map2的另一个实现版本
    *
    * @param a
    * @param b
    * @param f
    * @tparam A
    * @tparam B
    * @tparam C
    * @return
    */
  def map3[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] =
    a flatMap (aa =>
      b map (bb =>
        f(aa, bb)
        )
      )

  /**
    * scala中for推导结构,yield可以使用先前在<-符号左边绑定的任何职,
    * 编译器会对这些绑定操作的语法糖转换为flatMap调用,对最后一个绑定的
    * 和yield会转换为map调用.
    *
    * @param a
    * @param b
    * @param f
    * @tparam A
    * @tparam B
    * @tparam C
    * @return
    */
  def map4[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] =
    for {
      aa <- a
      bb <- b
    } yield f(aa, bb)

  /**
    * insuranceRateQuote 修改后的函数版本
    *
    * @param age
    * @param numberOfSpeedingTickets
    * @return
    */
  def parseRateQuote(age: Int, numberOfSpeedingTickets: Int): Option[Double] = {
    val optAge: Option[Int] = Try {
      age.toInt
    }
    val optTickets: Option[Int] = Try {
      numberOfSpeedingTickets.toInt
    }
    map2(optAge, optTickets)(insuranceRateQuote)
  }

  /**
    * 普通参数转换为Option
    *
    * @param a
    * @tparam A
    * @return
    */
  def Try[A](a: => A): Option[A] = try Some(a) catch {
    case e: Exception => None
  }

  /*  def parseInsuranceRateQuote(age: String, numberOfSpeedingTickets: String): Option[Double] = {
      val optAge: Option[Int] = Try(age.toInt)
      val optTickets: Option[Int] = Try(numberOfSpeedingTickets.toInt)
    }*/
}
