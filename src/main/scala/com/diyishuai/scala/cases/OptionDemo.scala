package com.diyishuai.scala.cases

object OptionDemo extends App {

  val map = Map("a" -> 1,"b" -> 2)
  val v = map.get("c") match {
    case Some(i) => i
    case None => 0
  }
  println(v)


  val v1 = map.getOrElse("c",0)
  println(v1)

}
