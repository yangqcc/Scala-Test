package functionscala.chapter4

/**
  * Created by yangqc on 2018/2/19.
  */
object SequenceOptionTest {

  def traverse[A, B](a: List[A])(f: A => Option[B]): Option[List[B]] = Some(a map (x => f(x).get))

  def sequence[A](a: List[Option[A]]): Option[List[A]] = {
    var value: Option[A] = null
    var list: List[A] = List()
    for (value <- a) {
      if (value.isEmpty) {
        return None
      } else {
        list :+ value.get
      }
    }
    return Some(list)
  }

  def Try[A](a: => A): Option[A] = try Some(a) catch {
    case e: Exception => None
  }

  def parseInt(a: List[String]): Option[List[Int]] = sequence(a map (i => Try(i.toInt)))

  def main(args: Array[String]): Unit = {
    val list: List[String] = List("1", "2", "3")
    parseInt(list).get.foreach(value => value + ",")
    parseInt(null)
  }
}
