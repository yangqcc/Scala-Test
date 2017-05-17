package com.yqc.controllerStatement

/**
  * Created by yangqc on 2017/5/18.
  */
class CaseStatement(val firstArg: Array[String]) {

  val caseArg = if (!firstArg.isEmpty) firstArg(0) else ""

  val friend = caseArg match {
    case "salt" => "pepper"
    case "chips" => "salsa"
    case "eggs" => "bacon"
    case _ => "huh?"
  }

}

object CaseStatement {

  def apply(firstArg: Array[String]): CaseStatement = new CaseStatement(firstArg)

  def main(args: Array[String]): Unit = {
    println(CaseStatement(Array[String]("yangqc", "shi")).friend)
    println(CaseStatement(Array[String]("salt", "chips", "eggs")).friend)
  }
}
