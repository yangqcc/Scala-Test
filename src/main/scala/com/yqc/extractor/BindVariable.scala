package com.yqc.extractor

/**
  * Created by yangqc on 2017/7/18.
  */
object Twice {

  def apply(s: String): String = s + s

  /**
    * 绑定一个变量
    *
    * @param s
    * @return
    */
  def unapply(s: String): Option[String] = {
    val length = s.length / 2
    val half = s.substring(0, length)
    if (half == s.substring(length)) Some(half) else None
  }
}

object UpperCase {

  /**
    * 未绑定任何变量，仅仅返回Boolean类型
    *
    * @param s
    * @return
    */
  def unapply(s: String): Boolean = s.toUpperCase == s
}


object NonAndOneVariablePattern extends App {

  def userTwiceUpper(s: String) = s match {
    case EMail(Twice(x@UpperCase()), domain) => "match: " + x + " in domain " + domain
    case _ => "no match"
  }

  val email = EMail("Nicholas", "sina.com")
  val number: Int = 12
  println(Twice(email))
  println(userTwiceUpper(Twice(email)))
}