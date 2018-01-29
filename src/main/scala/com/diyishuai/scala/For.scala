package com.diyishuai.scala

object For {
  def main(args: Array[String]): Unit = {
    val res = 1 to 10
    for (i <- res)
      println(i)

    println("======")

    val arr = Array(1,2,3)
    for(a <- arr)
      println(a)

    println("======")

    for (x <- 1 to 3; y <- 1 to 3 if x!=y)
      print((10*x + y) + " ")
    println()

    println("======")

    val z = for (i <- 1 to 10) yield i*10
    println(z)
  }
}
