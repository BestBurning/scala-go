package com.diyishuai.scala.classdemo

import scala.io.Source

class MissRight {

  val name = "abc"

  println(name)

  try {
    val cont = Source.fromFile("C:\\softs\\hadoop\\hadoop-2.9.0\\LICENSE.txt").mkString
    println(cont)
  } catch {
    case e: Exception => e.printStackTrace()
  } finally {
    println("finally")
  }

}

object A{
  def main(args: Array[String]): Unit = {
    val miss = new MissRight
  }
}


