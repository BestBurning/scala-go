package com.diyishuai.scala.array

object ArrayYieldDemo {

  def main(args: Array[String]): Unit = {
    val arr = 1 to 10
    val res = for (i <- arr if i % 2 ==0) yield i * 10
    println(res.toBuffer)


    val r = arr.filter(_ % 2 == 0).map(_ * 10)
    println(r.toBuffer)
  }

}
