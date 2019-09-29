package com.diyishuai.scala

object For {
  def main(args: Array[String]): Unit = {
    val res = 1 to 10
    for (i <- res)
      println(i)

    println("======")

    val arr = Array(1, 2, 3)
    for (a <- arr)
      println(a)

    println("======")

    for (x <- 1 to 3; y <- 1 to 3 if x != y)
      print((10 * x + y) + " ")
    println()

    println("======")

    val z = for (i <- 1 to 10) yield i * 10
    println(z)

    println("======")


    val n = for (i <- 1 to 100 if i % 9 == 0) yield {
      i
    }
    println(n.size + " | " + n.sum)

    val sum = 6
    for(i <- 0 to sum){
      println( s"${i} + ${sum-i} = ${sum}")
    }


    val class1 = List(80,80,80,80,80)
    val class2 = List(50,90,80,70,60)
    val class3 = List(70,70,70,70,70)

    val classes = List(class1,class2,class3)

    for (classn <- classes){
      println(classn.sum / classn.size)
    }



  }
}
