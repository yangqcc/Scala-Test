package functionscala.chapter4

/**
  * Created by yangqc on 2018/2/18.
  */
object TestOption {

  /**
    * 任何已存在的普通函数都可以转成在一个Option值的上下
    * 文里进行操作的函数
    *
    * @param f
    * @tparam A
    * @tparam B
    * @return
    */
  def lift[A, B](f: A => B): Option[A] => Option[B] = _ map f

  def absO: Option[Double] => Option[Double] = lift(math.abs)
}
