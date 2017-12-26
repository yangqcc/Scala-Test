package com.yqc.`abstract`

import java.io.File

/**
  * Created by yangqc on 2017/6/5.
  */
object FileMatcher {

  private def filesHere = (new File(".")).listFiles

  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file

  def filesContaining(query: String) =
    for (file <- filesHere; if file.getName.contains(query))
      yield file

  /**
    * 正则表达式
    *
    * @param query
    * @return
    */
  def filesRegex(query: String) =
    for {file <- filesHere
         if file.getName.matches(query)}
      yield file

  /**
    * 改进过后的函数
    *
    * @param marcher
    * @return
    */
  def filesMarching(marcher: String => Boolean) = {
    for (file <- filesHere; if marcher(file.getName))
      yield file
  }

  /**
    * 改进过后的函数
    */

  def filesEnding1(query: String) = filesMarching(_.endsWith(query))

  def filesContaining1(query: String) = filesMarching(_.contains(query))

  def filesRegex1(query: String) = filesMarching(_.matches(query))
}
