package com.yqc.covariance

/**
  * Created by yangqc on 2017/7/12.
  */
class Publication(val title: String)

class Book(title: String) extends Publication(title)

object Library {

  val books: Set[Book] = Set(
    new Book("Programming in Scala"),
    new Book("Walden")
  )

  def printBookList(info: Book => AnyRef): Unit = {
    for (book <- books) println(info(book))
  }
}

object Customer extends App {
  /**
    * 这就是一个协变和逆变啊，
    *
    * @param p
    * @return
    */
  def getTitle(p: Publication): String = p.title

  Library.printBookList(getTitle)
}
