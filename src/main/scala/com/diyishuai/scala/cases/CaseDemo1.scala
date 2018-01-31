package com.diyishuai.scala.cases

import scala.util.Random

object CaseDemo1 extends App {
  val arr = Array("1","2","3")
  val name = arr(Random.nextInt(arr.length))
  println(name)

  /**
    * 内容匹配
    */
  name match {
    case "1" => println("1 hi")
    case "2" => println("2 hello")
    case _ => println("3 others")
  }
}
