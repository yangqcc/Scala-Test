package functionscala.chapter4

/**
  * Created by yangqc on 2018/2/19.
  */
case class Person(name: Name, age: Age)

sealed class Name(val value: String)

sealed class Age(val value: Int)

object EitherTest2 {

  def map2[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] =
    a flatMap (aa =>
      b map (bb =>
        f(aa, bb)
        )
      )

  def mkName(name: String): Either[String, Name] =
    if (name == "" || name == null) Left("Name is empty.")
    else Right(new Name(name))

  def mkAge(age: Int): Either[String, Age] =
    if (age < 0) Left("Age is out of range.")
    else Right(new Age(age))

  def mkPerson(name: String, age: Int): Either[String, Person] =
    mkName(name).map2(mkAge(age))(Person(_, _))


}
