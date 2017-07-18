package com.yqc.extractor

/**
  * Created by yangqc on 2017/7/18.
  */
object EMail {

  /**
    * apply方法用于无new 构造对象
    *
    * @param user
    * @param domain
    * @return
    */
  def apply(user: String, domain: String):String = user + "@" + domain

  /**
    * unapply方法用于在模式匹配中充当extractor
    *
    * @param str
    * @return
    */
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }
}

object ApplyAndUnapply extends App {

  def patternMatching(x: String) = x match {
    /**
      * 下面的匹配会导致调用EMail.unapply(email)
      */
    case EMail(user, domain) => println("user=" + user + " domain=" + domain)

    /**
      * 匹配非法邮箱
      */
    case _ => println("non illegal email")
  }

  val email = EMail("zhouzhihubeyond", "sina.com")
  patternMatching(email)
  patternMatching("摇摆少年梦")
}
