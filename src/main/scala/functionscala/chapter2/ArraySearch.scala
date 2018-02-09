package functionscala.chapter2

object ArraySearch {

  /**
    * 多态函数
    *
    * @param as
    * @param p
    * @tparam A
    * @return
    */
  def findFirst[A](as: Array[A], p: A => Boolean): Int = {

    def loop(n: Int): Int =
      if (n >= as.length) -1
      else if (p(as(n))) n
      else loop(n + 1)

    loop(0)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def loop(n: Int): Boolean =
      if (n >= as.length) true
      else if (!ordered(as(n), as(n + 1))) false
      else loop(n + 1)

    loop(0)
  }
}
