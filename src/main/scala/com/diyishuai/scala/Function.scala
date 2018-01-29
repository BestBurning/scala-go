package com.diyishuai.scala

object Function {

  val f1 = (x:Int) => x * 100

  def main(args: Array[String]): Unit = {
    val r = 1 to 10
    println(r.map(f1))

    println(r.map((x:Int) => x * 100))

    println(r.map(x => x * 100))

    println(r.map(_ * 100))
  }

}
